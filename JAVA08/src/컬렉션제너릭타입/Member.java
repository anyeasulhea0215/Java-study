package 컬렉션제너릭타입;
 class Member {
    private String phoneNo;  // 필드명을 camelCase로 변경
    private String email;

    // 생성자
    public  Member(String phoneNo, String email) {
        this.phoneNo = phoneNo;
        this.email = email;
    }


    public String getPhoneNo() {
        return this.phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   

    // toString() 메소드 오버라이드
    @Override
    public String toString() {
        return "Member{" +
               "phoneNo='" + phoneNo + '\'' +
               ", email='" + email + '\'' +
               '}';
    }
}
