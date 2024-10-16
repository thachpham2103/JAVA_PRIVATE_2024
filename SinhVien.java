public class SinhVien {
        private String name ;
        private String address;
        private String lop;
        private double diem;

        public SinhVien(){

        }

        public SinhVien(String name, String address, String lop, double diem) {
            this.name = name;
            this.address = address;
            this.lop = lop;
            this.diem = diem;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getLop() {
            return lop;
        }

        public void setLop(String lop) {
            this.lop = lop;
        }

        public double getDiem() {
            return diem;
        }

        public void setDiem(double diem) {
            this.diem = diem;
        }
        @Override
        public String toString(){
            return " name:"+name+" address:"+address+" lop:"+lop+" Diểm:"+diem;
        }
    }

