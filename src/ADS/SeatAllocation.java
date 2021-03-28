package ADS;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.MaxPQ;
import edu.princeton.cs.algs4.StdOut;

import static edu.princeton.cs.algs4.StdOut.println;

public class SeatAllocation {


    public static class Party implements Comparable<Party> {
        int votes;
        int seats;
        double quotient;

        public Party(int votes) {
            this.votes = votes;
            this.seats = 0;
            this.quotient = votes;
        }

        public int getSeats(){
            return seats;
        }

        public void increaseSeats(){
            seats++;
        }

        public void calculateQuotient(){
            this.quotient = votes*1.0/(seats + 1);
        }

        @Override
        public int compareTo(Party that) {
            if (this.quotient > that.quotient){
                return 1;
            } else if (this.quotient < that.quotient){
                return -1;
            } else {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        int nParties = StdIn.readInt();
        int mSeats = StdIn.readInt();

        Party[] p = new Party[nParties];
        for (int i = 0; i < nParties; i++){
            p[i] = new Party(StdIn.readInt());
        }
        MaxPQ<Party> queue = new MaxPQ<>(p);
        while (mSeats > 0){
            Party party = queue.delMax();
            party.increaseSeats();
            party.calculateQuotient();
            queue.insert(party);
            mSeats--;
        }

        for (Party party : p) StdOut.println(party.getSeats());
    }
}
