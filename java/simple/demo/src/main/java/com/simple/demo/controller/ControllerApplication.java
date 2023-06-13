package com.simple.demo.controller;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.vo.Page;
import org.apache.ibatis.annotations.Delete;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

	@Resource
	UserMapper userMapper;
	@GetMapping
	public List<User> getUser() {
		return userMapper.findAll();
	}

	@PostMapping
	public String addUser(@RequestBody User user){
		//把前端传过来的数据转化为user实体类的对象插入到数据库中
		userMapper.save(user);
		return "success";


	}
	@PutMapping
	public String updateUser(@RequestBody User user){
		userMapper.updateById(user);
		return "success";
	}

	@DeleteMapping("/{id}")  //一一对相应的关系
	public String deleteUser(@PathVariable("id") Long id){
		//注解是循序json回传带有id
		userMapper.deleteById(id);
		return "success";
	}
	@GetMapping("/{id}")  //把返回的结果 返回出来 包装成一个user对象
	public User findById(@PathVariable("id") Long id){
		//注解是循序json回传带有id
		return userMapper.findById(id);
	}

	@GetMapping("/page")
	public Page<User> findByPage(@RequestParam(defaultValue = "1") Integer pageNum,
								 @RequestParam(defaultValue = "10") Integer pageSize) {
		Integer offset = (pageNum - 1) * pageSize;
		List<User> userData = userMapper.findByPage(offset, pageSize);
		Page<User> page = new Page<>();
		page.setData(userData);

		Integer total = userMapper.countUser();
		page.setTotal(total);
		page.setPageNum(pageNum);
		page.setPageSize(pageSize);
		return page;
	}

}
