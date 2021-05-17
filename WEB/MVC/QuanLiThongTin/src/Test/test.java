package Test;

import java.util.List;

import com.phuc.quanlithongtin.dao.thongtinDAO;
import com.phuc.quanlithongtin.dto.thongtinDTO;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thongtinDAO dao = new thongtinDAO();
//		List<thongtinDTO> list = dao.getListThongTin();
//		for (thongtinDTO o : list) {
//			System.out.println(o);
//		}
		thongtinDTO dto = dao.getListThongTinBy("2");
		System.out.println(dto);
	}

}
