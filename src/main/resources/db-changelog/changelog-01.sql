CREATE TABLE IF NOT EXISTS public.customer (
                                 id serial4 NOT NULL,
                                 surname varchar NOT NULL,
                                 name varchar NOT NULL,
                                 CONSTRAINT customer_pk PRIMARY KEY (id)
);


