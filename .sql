create database PaymentApp;
use PaymentApp;

-- Users Details Table
create table Users (
    user_id int auto_increment primary key,
    username varchar(50) unique not null,
    password varchar(255) not null,
    first_name varchar(50) not null,
    last_name varchar(50) not null,
    phone_number varchar(15) unique not null,
    email varchar(100) unique not null,
    address text
);
insert into users values(1,"Neelima","Neelima@123", "Undurthi", "Sai Neelima", "987654321","Neelu@gmail.com","Vizag");
insert into users values(3,"Anjani","Anjani@456", "Ganta", "Anjani", "9876543","Anjani@gmail.com","Ravulapalem");
insert into users values(2,"Geetha","Geetha@99", "Ganta", "Geetha", "93942309","Geetha@gmail.com","Amalpuram");
select * from users;
select count(*) as total_users from Users;


-- User Account Details Table
create table UserAccounts (
    user_account_id int auto_increment primary key,
    user_id int not null,
    account_opening_date datetime default current_timestamp,
    current_wallet_balance decimal(10,2) default 0.00,
    linked_bank_accounts_count int default 0,
    wallet_pin varchar(6) not null,
    foreign key (user_id) references Users(user_id) on delete cascade
);
insert UserAccounts (user_id, account_opening_date, current_wallet_balance, linked_bank_accounts_count, wallet_pin) 
values 
(1, NOW(), 5000.00, 2, '123456'),
(2, NOW(), 1200.50, 1, '654321'),
(3, NOW(), 750.25, 0, '987654');
select * from useraccounts;
select * from useraccounts where user_id=3;
update UserAccounts 
set current_wallet_balance = current_wallet_balance - 500.00
where user_id = 1;
select * from UserAccounts where user_id = 1;
update UserAccounts 
set current_wallet_balance = current_wallet_balance + 1000 
where user_id = 2;
select * from UserAccounts where user_id = 2;



-- Bank Accounts Table
create table BankAccounts (
    bank_account_id int auto_increment primary key,
    user_id int not null,
    account_number varchar(20) unique not null,
    ifsc_code varchar(20) not null,
    bank_name varchar(100) not null,
    branch_location varchar(100) not null,
    is_active varchar(3) default 'YES',
    foreign key (user_id) references Users(user_id) on delete cascade
);
insert into BankAccounts (user_id, account_number, ifsc_code, bank_name, branch_location, is_active) 
values 
(2, '123456789', 'HDFC0001234', 'HDFC Bank', 'Amalapuram', 'YES'),
(3, '987654321', 'UNDB0005678', 'Union Bank of India', 'Ravulapalem', 'NO'),
(1, '567890123', 'SBI00091011', 'State Bank of India', 'Vizag', 'YES');
select * from BankAccounts;

-- Source Type Table
create table SourceType (
    source_id int auto_increment primary key, 
    source_type_code enum('BA', 'WA', 'TPT') not null,
    source_type_destination varchar(50) not null
);
INSERT INTO SourceType (source_type_code, source_type_destination) 
VALUES 
('BA', 'Bank Account'),
('WA', 'Wallet Account'),
('TPT', 'Third Party Transaction');
select * from SourceType;
-- Transactions Details Table
create table Transactions (
    transaction_id int auto_increment primary key,
    transaction_date_time datetime default current_timestamp, 
    source_id int not null,
    target_id int not null,
    source_type_id int not null,
    destination_type_id int not null,
    transaction_amount decimal(10,2) not null,
    foreign key (source_type_id) references SourceType(source_id),
    foreign key (destination_type_id) references SourceType(source_id)
);
insert Transactions (source_id, target_id, source_type_id, destination_type_id, transaction_amount) 
values
(1, 2, 1, 2, 1500.75),  -- Bank Account to Wallet Account
(3, 1, 2, 3, 500.00),   -- Wallet Account to Third Party Transaction
(2, 3, 3, 1, 2000.50);  -- Third Party Transaction to Bank Account
select * from Transactions;
select * from Transactions order by transaction_amount desc limit 1;
select * from Transactions order by transaction_date_time desc;

































