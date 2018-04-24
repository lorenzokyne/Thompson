package testJSon;

public class Profile {
	private String title;
	private String phone;
	private String skype;
	private String real_name;
	private String real_name_normalized;
	private String display_name;
	private String display_name_normalized;
	private String fields[];
	private String status_text;
	private String status_emoji;
	private int status_expiration;
	private String avatar_hash;
	private String image_original;
	private String email;
	private String first_name;
	private String last_name;
	private String image_24;
	private String image_32;
	private String image_48;
	private String image_72;
	private String image_192;
	private String image_512;
	private String image_1024;
	private String team;
	
	 public String getTitle() {
		  return title;
	  }
	  public String getPhone() {
		  return phone;
	  }
	  public String getSkype() {
		  return skype;
	  }
	  
	  public String getRealname() {
		  return real_name;
	  }
	  public String getRealnameNormalized() {
		  return real_name_normalized;
	  }
	  public String getdisplay_name() {
		  return display_name;
	  }
	  public String getdisplay_name_normalized() {
		  return display_name_normalized;
	  }
	
	  public String[] getFields() {
		  return fields;
	  }
	
	  public String getStatus_text() {
		  return status_text;
	  }
	  public String getStatus_emoji() {
		  return status_emoji;
	  }
	  public int getStatus_expiration() {
		  return status_expiration;
	  }
	  
	  public String getAvatar_hash() {
		  return avatar_hash;
	  }
	  public String getImage_original() {
		  return image_original;
	  }
	  
	  public String getEmail() {
		  return email;
	  }
	  
	  public String getFirst_name() {
		  return first_name;
	  }
	  
	  public String getLast_name() {
		  return last_name;
	  }
	  
	  public String getImage_24() {
		  return last_name;
	  }
	  
	  public String getImage_32() {
		  return image_32;
	  }
	  
	  public String getImage_48() {
		  return image_48;
	  }
	  
	  public String getImage_72() {
		  return image_72;
	  }
	  
	  public String getImage_192() {
		  return image_192;
	  }
	  
	  public String getImage_512() {
		  return image_512;
	  }
	  
	  public String getImage_1024() {
		  return image_1024;
	  }
	 
	 
	 public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	/*public String stampaFields() {
		String temp="";
		for(int i=0;i<fields.length;i++) {
			temp=temp+fields[i]+" ";
		}
		return temp;
	}*/
	public String toString() {
		return "	title: "+title+"\n	phone: "+phone+"\n	skype: "+skype+"\n	real_name: "+real_name+"\n	real_name_normalized: "+real_name_normalized+"\n	display_name: "+display_name+"\n	display_name_normalized: "+display_name_normalized+"\n	fields: "+fields+"\n	status_text: "+status_text+"\n	status_emoji: "+status_emoji+"\n	status_expiration: "+status_expiration+"\n	avatar_hash: "+avatar_hash+"\n	image_original: "+image_original+"\n	email: "+email+"\n	first_name: "+first_name+"\n	last_name: "+last_name+"\n	image_24: "+image_24+"\n	image_32: "+image_32+"\n	image_48: "+image_48+"\n	image_72: "+image_72+"\n	image_192: "+image_192+"\n	image_512: "+image_512+"\n	image_1024: "+image_1024+"\n	team: "+team;
	}
}
