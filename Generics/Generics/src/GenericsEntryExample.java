public class GenericsEntryExample {
	public static void main(String[] args) {
		GenericsEntry<String, Long> entry = new GenericsEntry<>("teste",1L);
		System.out.println(entry.getData());

		GenericsEntry<Long, Integer> longEntry = new GenericsEntry<>(123L, 1);
		System.out.println(longEntry.getData());

		GenericsEntry<String,Integer> hashPerson = new GenericsEntry<>("Pedro",123);
		System.out.println(hashPerson.getData() + hashPerson.getCodigo());
	}
}
