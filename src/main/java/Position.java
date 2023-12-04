public class Position {
    private int position;

    public Position(){
        this.position = 0;
    }

    public Position(int position) {
        this.position = position;
    }

    public int forward(){
        this.position += 1;
        return this.position;
    }

    @Override
    public boolean equals(Object obj) {
        if (!obj.getClass().equals(Position.class)) {
            return false;
        }
        Position obj1 = (Position) obj;
        return this.position == obj1.position;
    }
}

