package io.github.talentdevelopment004.generics;

public class ApiResponse<T> {
    private boolean success;
    private T data;
    private Error error;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    class Error {
        private String message;
        private String customerMessage;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getCustomerMessage() {
            return customerMessage;
        }

        public void setCustomerMessage(String customerMessage) {
            this.customerMessage = customerMessage;
        }

    }
}
