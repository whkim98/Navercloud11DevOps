--ename이 'A'나 'S'로 시작하는 사람의 ENAME, SAL, COMM 조회
select ename, sal, comm from emp where ename like 'A%' or ename like 'S%';
--COMM이 NULL이 아닌 사람만 조회
select * from emp where comm is not null;
--MGR이 7698, 7566, 7782인 사람 조회
select * from emp where mgr in (7698, 7566, 7782);
--SAL이 2500부터 3000까지 조회
select * from emp where sal >= 2500 and sal <= 3000;
--SAL이 2500부터 3000까지 조회
select * from emp where sal between 2500 and 3000;

--JOB을 중복처리 해서 한 번씩만 출력
select distinct job from emp;

--ALLEN의 직업과 같은 직업을 가진 사람들 조회
select * from emp where job = (select job from emp where ename = 'ALLEN');

--SCOTT의 MGR과 같은 값을 가진 사람의 정보 조회
select * from emp where mgr = (select mgr from emp where ename = 'SCOTT');

--숫자함수
select abs(-5) from dual; --절댓값

select ceil(3.0), ceil(3.1), ceil(3.9) from dual; --무조건 올림
select floor(3.0), floor(3.1), floor(3.9) from dual; -- 무조건 내림
select mod(7, 3), mod(9, 5) from dual; --나머지
select power(2, 3), power(3,4) from dual; --제곱

--문자함수
select concat('HAPPY', 'DAY') from dual;
select 'HAPPY'||'DAY' from dual;
select initcap('HAPPY'), initcap('hello') from dual;
select lower('heLLOdAy'), upper('heLLOdAy') from dual;
select lpad(sal, 10, '*') from emp; --왼쪽으로 * 채우기
select rpad(sal, 10, '*') from emp; --오른쪽으로 * 채우기
select substr('happy day', 2, 3) from dual; --2번 인덱스부터 3글자(자바와 달리 첫 번째 인덱스가 1임)
select substr('happy day', -5, 3) from dual; -- 뒤에서 5번째 부터 3글자
select ename, length(ename) 글자수 from emp;
select replace('Good Day', 'o', '*') from dual; --o를 *로 변경
select instr('happy', 'a') from dual; -- happy에 a위치
select instr('happy', 'x') from dual; -- x가 없을 경우 0
select instr('have a nice day', 'nice') from dual; -- 8번째에 nice가 있음

--기타 함수
--NVL
select nvl(comm, 1000) from emp; --comm이 널이면 1000 아니면 그대로 출력
--decode: 값에 따라 다른 값 출력
select ename 사원명, deptno 부서코드, 
decode(deptno, 10, '홍보부', 20, '교육부', 30, '인사부') 부서명 from emp;

select emp.empno, emp.ename, emp.job, dept.dname, dept.loc from emp, dept
where emp.deptno = dept.deptno;

select empno, ename, job, dname, loc from emp, dept
where emp.deptno = dept.deptno;


