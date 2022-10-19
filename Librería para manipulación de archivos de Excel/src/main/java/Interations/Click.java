package Interations;


/* Ejemplo de interación con el actor para dar click

    public class Click implements Interaction {

        private final Target target;

        public Click(Target target) {
            this.target = target;
        }

        @Override

        @Step("{0} clicks on #target")
        public <T extends Actor> void performAs(T theActor) {
            WebElement targetElement = target.resolveFor(theActor);
            BrowseTheWeb.as(theActor).evaluateJavascript("arguments[0].click()", targetElement);
        }
}*/