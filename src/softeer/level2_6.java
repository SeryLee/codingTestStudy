package softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class level2_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        List<String> room = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            room.add(br.readLine());
        }
        Collections.sort(room);
        HashMap<String, List<Integer>> reservation = new HashMap<>();
        for (int i = 0; i < N; i++) {
            reservation.put(room.get(i), new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            String[] temp = br.readLine().split(" ");
            String tempTime = temp[1] + temp[2];
            reservation.get(temp[0]).add(Integer.parseInt(tempTime));
        }
        int start;
        int end;
        boolean available = true;
        for (int i = 0; i < N; i++) {
            List<Integer> availableTime = new ArrayList<>();
            List<Integer> checkTime = reservation.get(room.get(i));
            Collections.sort(checkTime);
            if (checkTime.size() == 0) {
                availableTime.add(9);
                availableTime.add(18);
            }
            for (int j = 0; j < checkTime.size(); j++) {
                start = checkTime.get(j) / 100;
                end = checkTime.get(j) % 100;
                if (checkTime.size() == 1) {
                    if (start < 9) {
                        available = false;
                    } else if (start > 9) {
                        if (end < 18) {
                            availableTime.add(9);
                            availableTime.add(start);
                            availableTime.add(end);
                            availableTime.add(18);
                        } else {
                            availableTime.add(9);
                            availableTime.add(start);
                        }
                    } else {
                        if (end >= 18) {
                            available = false;
                        } else {
                            availableTime.add(end);
                            availableTime.add(18);
                        }
                    }
                } else {
                    if (j == 0) {
                        if (start < 9) {
                            available = false;
                        } else if (start > 9) {
                            availableTime.add(9);
                            availableTime.add(start);
                            availableTime.add(end);
                        } else {
                            availableTime.add(end);
                        }
                    } else if (j == checkTime.size() - 1) {
                        if (end < 18) {
                            if (availableTime.get(availableTime.size() - 1) > start) {
                                available = false;
                            } else if (availableTime.get(availableTime.size() - 1) < start) {
                                availableTime.add(start);
                                availableTime.add(end);
                                availableTime.add(18);
                            } else {
                                availableTime.remove(availableTime.size() - 1);
                                availableTime.add(end);
                                availableTime.add(18);
                            }
                        } else if (end > 18) {
                            available = false;
                        } else {
                            if (availableTime.get(availableTime.size() - 1) > start) {
                                available = false;
                            } else if (availableTime.get(availableTime.size() - 1) < start) {
                                availableTime.add(start);
                            } else {
                                availableTime.remove(availableTime.size() - 1);
                            }
                        }
                    } else {
                        if (availableTime.get(availableTime.size() - 1) > start) {
                            available = false;
                        } else if (availableTime.get(availableTime.size() - 1) < start) {
                            availableTime.add(start);
                            availableTime.add(end);
                        } else {
                            availableTime.remove(availableTime.size() - 1);
                            availableTime.add(end);
                        }
                    }
                }
            }
            System.out.println("Room " + room.get(i) + ":");
            if (!available || availableTime.size() == 0) {
                System.out.println("Not available");
            } else {
                System.out.println(availableTime.size() / 2 + " available:");
                for (int j = 0; j < availableTime.size(); j += 2) {
                    if (availableTime.get(j) < 10) {
                        System.out.print("0" + availableTime.get(j) + "-");
                        System.out.println(availableTime.get(j + 1));
                    } else {
                        System.out.print(availableTime.get(j) + "-");
                        System.out.println(availableTime.get(j + 1));
                    }
                }
            }
            if (i != room.size() - 1) {
                System.out.println("-----");
            }
            available = true;
        }
        br.close();
    }
}
