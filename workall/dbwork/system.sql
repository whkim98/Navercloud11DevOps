create user c##TAA identified by taa;

grant connect, resource to c##TAA;

alter user c##TAA default tablespace users quota unlimited on users;