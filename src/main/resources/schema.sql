DROP TABLE IF EXISTS public.employees;
CREATE TABLE IF NOT EXISTS public.employees
(
    id bigint NOT NULL,
    email_address character varying(255) NOT NULL,
    first_name character varying(255) NOT NULL,
    last_name character varying(255) NOT NULL,
    CONSTRAINT employees_pkey PRIMARY KEY (id)
    )
    TABLESPACE pg_default;
ALTER TABLE IF EXISTS public.employees OWNER to postgres;
