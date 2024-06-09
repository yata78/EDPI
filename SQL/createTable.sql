DROP TABLE Edpis;
DROP TABLE Users;

create Table Users (
    UserId SERIAL PRIMARY KEY,
    UserName VARCHAR NOT NULL,
    UserPassword VARCHAR NOT NULL,
    Created_At TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

create Table Edpis (
    UserId INTEGER,
    Dpi INTEGER NOT NULL,
    Sensitivity DECIMAL(1,4) NOT NULL,
    Created_At TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	FOREIGN KEY(UserId) REFERENCES Users(UserId)
);