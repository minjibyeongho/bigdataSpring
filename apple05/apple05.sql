create table member(
	id varchar2(20),
	pw varchar2(20),
	name varchar2(20),
	tel varchar2(20)
)

insert into member values ('park','park','park','park');
insert into member values ('lee','lee','lee','lee');
insert into member values ('kim','kim','kim','kim');

select * from member

create table bbs(
id varchar2(20),
title varchar2(20),
content varchar2(20),
writer varchar2(20)
)

insert into bbs values('test','test','test','test')

select * from bbs
