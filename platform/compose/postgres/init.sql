CREATE USER grafana with PASSWORD 'grafana' CREATEDB;
CREATE DATABASE grafana
    WITH
    OWNER  = grafana
    ENCODING = 'UTF8'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;

CREATE USER app with PASSWORD 'app' CREATEDB;
CREATE DATABASE app
    WITH
    OWNER  = app
    ENCODING = 'UTF8'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;