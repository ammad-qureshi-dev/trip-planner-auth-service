create schema if not exists auth_service;

create table "user" (
	user_id uuid primary key default uuid_generate_v4 (),
	full_name varchar(255) not null,
	email varchar(255) unique not null,
	phone_number varchar(20) unique,
	country varchar(255),
	area_code integer,
	is_verified boolean,
	is_active boolean,
	updated_at timestamp
);