package app.entity;

class Entity {



	public String get(String key){
		try {
			return this.getClass().getField(key).toString();
		} catch (NoSuchFieldException | SecurityException e) {
			System.out.println("Erreur : champ "+key+" inconnu pour la classe "+this.getClass().getName());
		}
		return null;
	}
}
