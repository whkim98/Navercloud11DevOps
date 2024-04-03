/*
join 연습용 테이블 2개 생성
*/
create table food(foodnum number(3) primary key, 
foodname varchar2(20), 
foodprice number(7), foodsize varchar2(20));

insert into food values(100, '짜장면', 9000, '보통');
insert into food values(101, '짜장면', 11000, '곱빼기');
insert into food values(200, '탕수육', 15000, '보통');
insert into food values(201, '탕수육', 20000, '곱빼기');
insert into food values(300, '칠리새우', 15000, '소');
insert into food values(301, '칠리새우', 30000, '대');
insert into food values(400, '해물짬뽕', 11000, '보통');
commit;
select * from food;

create sequence seq_food nocache;

create table booking(
bnum number(3) primary key, bname varchar2(20) not null,
bhp varchar2(20) unique, foodnum number(3),bookingday date,
foreign key (foodnum) references food(foodnum) on delete cascade);

insert into booking values(seq_food.nextval, '홍범자', '010-2222-3333', 101, sysdate);
insert into booking values(seq_food.nextval, '이영자', '010-3434-8899', 301, sysdate+7);
insert into booking values(seq_food.nextval, '김유정', '010-9999-3333', 400, sysdate);
insert into booking values(seq_food.nextval, '강호동', '010-3322-4433', 200, sysdate);

select * from food f, booking b where f.foodnum = b.foodnum;
