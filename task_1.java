@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    boolean trueBoolean = true;
	assertEquals("Вы не совершенолетний!", trueBoolean, isAdult);
}
