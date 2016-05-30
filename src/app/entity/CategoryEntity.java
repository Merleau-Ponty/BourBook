package app.entity;

public class CategoryEntity extends Entity{

	private int idCategory;
	private String label;
	
	
	public CategoryEntity(int idCategory, String label) {
		super();
		this.idCategory = idCategory;
		this.label = label;
	}
	
	public int getIdCategory() {
		return idCategory;
	}
	public String getName() {
		return label;
	}

	@Override
	public String toString() {
		return "CategoryEntity [idCategory=" + idCategory + ", label=" + label
				+ "]";
	}

}
