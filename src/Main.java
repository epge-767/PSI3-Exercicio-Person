//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    Person p1 = new Person();
    p1.setNome("Gonçalo");
    p1.setApelido("Costa");
    p1.setIdade(23);

    Person p2 = new Person("André", "Santos",19);
    p1.compararIdades(p2);
}

