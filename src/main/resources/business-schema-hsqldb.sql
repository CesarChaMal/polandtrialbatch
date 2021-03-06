
-- Autogenerated: do not edit this file

DROP TABLE INSTRUMENT_PRICE_MODIFIER IF EXISTS;

CREATE TABLE INSTRUMENT_PRICE_MODIFIER (
  ID bigint PRIMARY KEY,
  name VARCHAR(256) not null unique,
  multiplier DECIMAL(10,2) not null
);

INSERT INTO INSTRUMENT_PRICE_MODIFIER (ID, name, multiplier) VALUES (1, 'INSTRUMENT1', 1.05);
INSERT INTO INSTRUMENT_PRICE_MODIFIER (ID, name, multiplier) VALUES (2, 'INSTRUMENT2', 1.10);
INSERT INTO INSTRUMENT_PRICE_MODIFIER (ID, name, multiplier) VALUES (3, 'INSTRUMENT3', 1.15);
INSERT INTO INSTRUMENT_PRICE_MODIFIER (ID, name, multiplier) VALUES (4, 'INSTRUMENT5', 2);

