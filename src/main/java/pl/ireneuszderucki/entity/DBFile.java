package pl.ireneuszderucki.entity;

public abstract class DBFile {
	
	private int id;

	private String fileName;
	
	private String fileType;

	private byte[] data;

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected String getFileName() {
		return fileName;
	}

	protected void setFileName(String fileName) {
		this.fileName = fileName;
	}

	protected String getFileType() {
		return fileType;
	}

	protected void setFileType(String fileType) {
		this.fileType = fileType;
	}

	protected byte[] getData() {
		return data;
	}

	protected void setData(byte[] data) {
		this.data = data;
	}
	
}
