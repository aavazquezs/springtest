package ao.edu.isutic.springcourse.conf2.sistemaDeSom;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements DiscoCompacto{
    private String titulo = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artista = "The Beatles";

    @Override
    public void reproducir() {
        System.out.println("Playing " + titulo + " by " + artista);
    }

    @Override
    public void playTrack(int trackNumber) {
        System.out.println("Playing track number "+trackNumber);
    }
}
