create  database wsy_test1;
use wsy_test1;
-- 创建学生表
create table stu(
                    id int comment '学号',
                    name varchar(20) comment '姓名',
                    gender char(1) comment '性别',
                    age tinyint comment '年龄',
                    entryTime date comment '入学时间'
)comment '学生表';

-- 插入数据
insert into stu (id, name, gender, age, entryTime) values
                                                       (1, '张三', '男', 18, '2020-09-01'),
                                                       (2, '李四', '女', 19, '2020-09-01'),
                                                       (3, '王五', '男', 20, '2020-09-01'),
                                                       (4, '赵六', '女', 21, '2020-09-01'),
                                                       (5, '孙七', '男', 22, '2020-09-01'),
                                                       (6, '周八', '女', 23, '2020-09-01'),
                                                       (7, '吴九', '男', 24, '2020-09-01'),
                                                       (8, '郑十', '女', 25, '2020-09-01');