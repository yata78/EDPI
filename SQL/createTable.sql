DROP TABLE Users;
DROP TABLE Edpi;

create Table Users {
    UserId SERIAL PRIMARY KEY,
    UserName VARCHAR,
    UserPassword VARCHAR,
    Created_At TIMESTAMP DEFAULT CURRENT_TIMESTAMP
};

create Table Edpis {
    UserId INT FOREIGN KEY,
    Dpi INT,
    Sensitivity DECIMAL(1,4),
    Created_At TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
};