CREATE TABLE public.kitchen (
                                id serial4 NOT NULL,
                                "name" varchar NOT NULL,
                                CONSTRAINT kitchen_pk PRIMARY KEY (id)
);

CREATE TABLE public.order_status (
                                     id serial4 NOT NULL,
                                     "name" varchar NOT NULL,
                                     CONSTRAINT order_status_pk PRIMARY KEY (id),
                                     CONSTRAINT order_status_un UNIQUE (name)
);

CREATE TABLE public.dish (
                             id serial4 NOT NULL,
                             "name" varchar NOT NULL,
                             kitchen_id int4 NOT NULL,
                             price numeric(10, 2) NOT NULL,
                             CONSTRAINT dish_pk PRIMARY KEY (id),
                             CONSTRAINT dish_fk FOREIGN KEY (kitchen_id) REFERENCES public.kitchen(id)
);

CREATE TABLE public."order" (
                                id serial4 NOT NULL,
                                customer_id int4 NOT NULL,
                                created_at timestamp NOT NULL DEFAULT now(),
                                order_status_id int4 NOT NULL,
                                total_order_amount numeric(10, 2) NOT NULL,
                                CONSTRAINT order_pk PRIMARY KEY (id),
                                CONSTRAINT order_fk FOREIGN KEY (customer_id) REFERENCES public.customer(id),
                                CONSTRAINT order_fk_1 FOREIGN KEY (order_status_id) REFERENCES public.order_status(id)
);

CREATE TABLE public.order_items (
                                    id bigserial NOT NULL,
                                    order_id int4 NOT NULL,
                                    dish_id int4 NOT NULL,
                                    quantity int4 NOT NULL,
                                    CONSTRAINT order_items_check CHECK ((quantity > 0)),
                                    CONSTRAINT order_items_pk PRIMARY KEY (id),
                                    CONSTRAINT order_items_fk FOREIGN KEY (dish_id) REFERENCES public.dish(id),
                                    CONSTRAINT order_items_fk_1 FOREIGN KEY (order_id) REFERENCES public."order"(id)
);