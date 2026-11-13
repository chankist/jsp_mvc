package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

import dbutil.DBConnection;
import dto.MemberDto;

public class MemberDao {

	//회원 가입 메소드
	public int insertMember(String userid, String userpw, String username, String email) {
		
		String sql = "INSERT INTO "
				+ "member(userid, userpw, username, email)"
				+ "VALUES(?, ?, ?, ?)";
		
		int result = 0;
		
	try {
		
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, userid);
		pstmt.setString(2, userpw);
		pstmt.setString(3, username);
		pstmt.setString(4, email);
		
		result = pstmt.executeUpdate();
		
		
	} catch(Exception e) {
		e.printStackTrace();
	}
		
		return result;//성공했을때 1이 반환, 실패했을때 0이 반환
	}
	
	//로그인 처리 메소드
	
	public MemberDto login(String userid, String userpw) {
		
		String sql = "SELECT * FROM member WHERE userid=? AND userpw=? ";
		
		try {
			
			Connection conn = DBConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, userid);
			pstmt.setString(2, userpw);
			
			ResultSet rs = pstmt.executeQuery();
			
			
			
			if(rs.next()) {
				String uid = rs.getString("userid");
				String upw = rs.getString("userpw");
				String uname = rs.getString("username");
				String uemail = rs.getString("email");
				Timestamp udate = rs.getTimestamp("userdate");
			
				MemberDto mdto = new MemberDto(uid, upw, uname, uemail, udate);
				
				return mdto;
				
			} 
				
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
			
			return null;
			
		}
		
		
		
	}
	
	

