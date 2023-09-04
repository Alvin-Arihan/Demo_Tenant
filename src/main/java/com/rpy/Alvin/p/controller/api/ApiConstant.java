package com.rpy.Alvin.p.controller.api;

public class ApiConstant {

    public static final String API_VERSION = "/v1";
    public static final String API = "/api";
    public static final String TENANT = "/tenant";
    public static final String USER = "/user";
    public static final String ROOM = "/room";
    public static final String PAYMENT = "/payment";
    public static final String CORE_TENANT_API = API + API_VERSION + TENANT;
    public static final String ADD_TENANT ="/add_tenant";
    public static final String UPDATE_TENANT ="/update_tenant";
    public static final String DELETE_TENANT ="/delete_tenant";
    public static final String FETCH_TENANT ="/fetch_tenant";

    public static final String CORE_USER_API = API + API_VERSION + USER;

    public static final String ADD_USER ="/add_user";
    public static final String UPDATE_USER ="/update_user";
    public static final String DELETE_USER ="/delete_user";
    public static final String FETCH_USER ="/fetch_user";
    public static final String CORE_ROOM_API = API + API_VERSION + ROOM;
    public static final String FETCH_ROOM ="/fetch_room";
    public static final String ADD_ROOM ="/add_room";
    public static final String UPDATE_ROOM ="/update_room";
    public static final String DELETE_ROOM ="/delete_room";
    public static final String FETCH_ROOM_BY_ID ="/fetch_roomById";
    public static final String FETCH_ROOM_BY_TENANT_NAME = "/fetch_room_by_tenant_name";
    public static final String FETCH_ROOM_BY_TENANT_ID = "/fetch_room_by_tenant_id";
    public static final String CORE_PAYMENT_API = API + API_VERSION + PAYMENT;
    public static final String ADD_PAYMENT ="/add_payment";
    public static final String FETCH_PAYMENT_BY_ID ="/fetch_payment";
    public static final String FETCH_PAYMENT_BY_ROOM_ID ="/fetch_paymentByRoom";

}
