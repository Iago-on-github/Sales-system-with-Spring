package com.springbootproject.couse.Entities.Enuns;

public enum OrderStatus {
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int code;

    OrderStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static OrderStatus valueOf(int code) {
        for (OrderStatus os : OrderStatus.values()) {
            if (os.getCode() == code) {
                return os;
            }
        }
        throw new IllegalArgumentException("INVALID ORDER-STATUS CODE");
    }
}
