CREATE TABLE IF NOT EXISTS public.authority
(
    id integer NOT NULL,
    name character varying(50),
    CONSTRAINT role_pkey PRIMARY KEY (id),
    CONSTRAINT authority_name_unique_index UNIQUE (name)
);


INSERT INTO AUTHORITY(ID, NAME) VALUES (1, 'SUPER_ADMIN');
INSERT INTO AUTHORITY(ID, NAME) VALUES (2, 'ADMIN');
INSERT INTO AUTHORITY(ID, NAME) VALUES (3, 'USERS');
INSERT INTO AUTHORITY(ID, NAME) VALUES (4, 'ROLE_PLAYER');