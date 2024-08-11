--テーブル作成 --

/* ユーザテーブル */
CREATE TABLE MUser (
    userId INTEGER NOT NULL PRIMARY KEY,
    pass VARCHAR(20) NOT NULL,
    created_at DATE,
    updated_at DATE
);

/* 試合テーブル */
CREATE TABLE match (
    matchId INTEGER NOT NULL PRIMARY KEY,
    userId INTEGER NOT NULL REFERENCES user(userId),
    killCount smallint NOT NULL,
    deathCount smallint NOT NULL,
    matchDate DATE NOT NULL
)

/* 感度テーブル */
CREATE TABLE sensitivity (
    sensitivityId INTEGER NOT NULL PRIMARY KEY,
    userId INTEGER NOT NULL REFERENCES user(userId),
    sensitivityInGame INTEGER NOT NULL,
    dpi real NOT NULL
)