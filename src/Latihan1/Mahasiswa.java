package Latihan1;

import java.util.HashMap;
import java.util.Scanner;

    public class Mahasiswa {

        String nama, kelas, matkulPraktikum;

        int nim;

        public Mahasiswa(String namaMhs, String klsMhs, String matkulMhs, int nimMhs) {
            nama = namaMhs;
            kelas = klsMhs;
            matkulPraktikum = matkulMhs;
            nim = nimMhs;
        }

        public static void main(String[] args) {
            try (Scanner scn = new Scanner(System.in)) {
                HashMap<String, Mahasiswa> mhs = new HashMap<>();

                String input;
                Mahasiswa data;

                mhs.put("0001", new Mahasiswa("Lintar", "4K", "Struktur Data", 379));
                mhs.put("0002", new Mahasiswa("Rezha", "4K", "Pemrograman Lanjut", 666));
                mhs.put("0003", new Mahasiswa("Candra", "4K", "Pemrograman Berorientasi Object", 999));

                System.out.print("Input ID: ");
                input = scn.nextLine();
                data = mhs.get(input);
                if (data != null) {
                    System.out.println("Data Mahasiswa : ");
                    System.out.println("Nama \t\t\t: " + data.nama + "\nKelas \t\t\t: " + data.kelas + "\nMK. Praktikum\t: " + data.matkulPraktikum + "\nNIM \t\t\t: " + data.nim);
                } else {
                    System.out.println("Data not found");
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }
