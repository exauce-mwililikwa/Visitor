public class Computer implements ComputerPart {
ComputerPart[] partrs;

    public Computer() {
        partrs=new ComputerPart[]{
                new Mouse(),new Keyboard(),new Monitor(),
        };
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
for(int i=0;i<partrs.length;i++){
    partrs[i].accept(computerPartVisitor);
}
computerPartVisitor.visit(this);
    }
}
