create user c##TAA identified by taa;

grant connect, resource to c##TAA;

alter user c##TAA default tablespace users quota unlimited on users;

create user c##scott identified by scott;

grant connect, resource to c##scott;

alter user c##scott default tablespace users quota unlimited on users;

conn c##scott/scott;

ALTER SYSTEM SET DEFERRED_SEGMENT_CREATION=true;

alter session set "_oracle_script"=true;

DROP USER c##scott CASCADE;

commit;

show user;




