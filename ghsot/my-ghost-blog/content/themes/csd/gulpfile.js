const gulp = require('gulp');
const less = require('gulp-less');
const concat = require('gulp-concat');
const rename = require('gulp-rename');
const autoprefixer = require('gulp-autoprefixer');
const cleanCSS = require('gulp-clean-css');
const uglify = require('gulp-uglify');

gulp.task('less', () =>
  gulp
    .src(['src/assets/less/**/main.less', 'src/assets/less/**/*.less'])
    .pipe(concat('style.less'))
    .pipe(less())
    .pipe(
      autoprefixer({
        browsers: ['last 2 versions', 'Android >= 4.0'],
        cascade: false,
      })
    )
    .pipe(cleanCSS({ compatibility: 'ie8' }))
    .pipe(gulp.dest('src/assets/css'))
);

gulp.task('css', () =>
  gulp
    .src(['src/assets/css/*.css'])
    .pipe(concat('style.min.css'))
    .pipe(
      autoprefixer({
        browsers: ['last 2 versions', 'Android >= 4.0'],
        cascade: false,
      })
    )
    .pipe(cleanCSS({ compatibility: 'ie8' }))
    .pipe(gulp.dest('assets/css'))
);

gulp.task('js', () =>
  gulp
    .src([
      'src/assets/js/jquery.min.js',
      'src/assets/js/bootstrap.min.js',
      'src/assets/js/pace.min.js',
      'src/assets/js/main.js',
    ])
    .pipe(uglify())
    .pipe(concat('index.min.js'))
    .pipe(gulp.dest('assets/js'))
);

gulp.task('watch', () => {
  gulp.watch('src/assets/less/**/*.less', gulp.series('less', 'css'));
  gulp.watch('src/assets/css/*.css', gulp.series('css'));
  gulp.watch('src/assets/js/**/*.js', gulp.series('js'));
});

gulp.task('build', gulp.series('less', 'css', 'js'));

gulp.task('default', gulp.series('build', 'watch'));
