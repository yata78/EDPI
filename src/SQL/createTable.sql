--テーブル作成 --

/* ユーザテーブル */
CREATE TABLE MUser (
    userId SERIAL NOT NULL PRIMARY KEY,
    pass VARCHAR(20) NOT NULL,
    created_at DATE,
    updated_at DATE
);

/* 試合テーブル */
CREATE TABLE Match (
    matchId SERIAL NOT NULL PRIMARY KEY,
    userId INTEGER NOT NULL REFERENCES MUser(userId),
    killCount smallint NOT NULL,
    deathCount smallint NOT NULL,
    matchDate DATE NOT NULL
);

/* 感度テーブル */
CREATE TABLE Sensitivity (
    sensitivityId SERIAL NOT NULL PRIMARY KEY,
    userId INTEGER NOT NULL REFERENCES MUser(userId),
    sensitivityInGame INTEGER NOT NULL,
    dpi INTEGER NOT NULL
);