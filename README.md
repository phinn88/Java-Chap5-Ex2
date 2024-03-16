## Lớp Computer
-	Là một lớp trừu tượng
-	Có thuộc tính chứa tên name (public) kiểu String
-	Có thuộc tính chứa ID (protected) kiểu String
-	Có thuộc tính giá price (default) kiểu float hoặc int
-	Có 1 phương thức trừu tượng void showInfo()
-	Có hàm tạo với tham số là các thuộc tính nói trên
## Lớp Laptop
-	Kế thừa (extend) lớp Computer
-	Có thêm thuộc tính weight kiểu int
-	Có hàm tạo với đầy đủ thuộc tính
-	Viết lại hàm showInfo() trong đó hiển thị đầy đủ thông tin thuộc tính
## Lớp PC
- Kế thừa (extend) lớp Computer
- Có thuộc tính mô tả description (private) kiểu String có hàm get set tương ứng
- Có hàm tạo với đầy đủ thuộc tính
- Viết lại hàm showInfo() trong đó hiển thị đầy đủ thông tin thuộc tính
## Lớp Main
- Trong phương thức main() tạo ra 1 đối tượng PC và 1 đối tượng Laptop
- Gọi phương thức showInfo() của mỗi đối tượng để hiện thị thông tin thuộc tính của đối tượng
