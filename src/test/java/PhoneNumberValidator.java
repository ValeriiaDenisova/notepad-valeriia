public class PhoneNumberValidator {

    public void validatePhoneNumber(String number) {

        class PhoneNumber {

            private String phoneNumber;

            public PhoneNumber() {
                this.phoneNumber = number;
            }

            public String getPhoneNumber() {
                return phoneNumber;
            }

            public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
            }
        }

        //...код валидации номера
    }
}


