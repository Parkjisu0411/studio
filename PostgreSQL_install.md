## PostgreSQL 설치 (Ubuntu)

1. PostgreSQL 설치 명령어

   sudo apt-get install postgresql

2. User, DB 생성

   - sudo -i -u postgres (postgres 계정으로 접근)
   - psql (db 연결)
   - CREATE USER username WITH PASSWORD 'password'; (user 생성)
   - CREATE DATABASE 'databasename'; (DB 생성)

3. 외부 접속 허용하기

   - sudo vi /etc/postgresql/12/main/postgresql.conf
     - Listen_addresses에 '*' 추가
   - sudo vi /etc/postgresql/12/main/pg_bha.conf
     - host	all	all	0.0.0.0/0	password 추가
   - AWS EC2 인스턴스 보안그룹에 5432 포트 설정 추가

4. pgAdmin 접속 테스트

   - AWS EC2 인스턴스의 퍼블릭 IPv4 주소로 접근

