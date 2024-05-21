@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    assertEquals("Должно вернуться true, так как пользователь 
совершеннолетний", true, isAdult);
}

@Test
public void checkIsAdultWhenAgeIsLessThan18False() {
    Program program = new Program();
    boolean isNotAdult = program.checkIsAdult(16);
    assertNotEquals("Должно вернуться false, так как пользователь 
несовершенолетний", true, isNotAdult);
}

@Test
public void checkIsAdultWhenAgeIs18True() {
    Program program = new Program();
    boolean isAdultEighteen = program.checkIsAdult(18);
    assertEquals("Должно вернуться true, так как пользователь 
совершеннолетний", true, isAdultEighteen);
}
