#
CREATE TABLE USER(
	USERID INT(5) UNSIGNED AUTO_INCREMENT,
	FIRSTNAME VARCHAR(50),
	LASTNAME VARCHAR(50),
	PHONENUMBER VARCHAR(20),
	ADDRESS VARCHAR(100),
	CITY VARCHAR(50),
	ZIPCODE VARCHAR(10),
	STATE VARCHAR(50),
	STATUSID INT(1) UNSIGNED,
	PRIMARY KEY (USERID),
	FOREIGN KEY (STATUSID) REFERENCES USER_STATUS(STATUSID)
);
#
#
CREATE TABLE USER_ALIAS(
	USERNAME VARCHAR(50),
	USERID INT(5) UNSIGNED,
	PRIMARY KEY (USERNAME),
	FOREIGN KEY (USERID) REFERENCES USER(USERID)
);
#
#
CREATE TABLE USER_ROLES(
	ID INT(6) UNSIGNED AUTO_INCREMENT,
	USERNAME VARCHAR(50),
	ROLEID INT(1) UNSIGNED,
	PRIMARY KEY (ID),
	FOREIGN KEY (USERNAME) REFERENCES USER_ALIAS(USERNAME),
	FOREIGN KEY (ROLEID) REFERENCES ROLES(ROLEID)
);
#