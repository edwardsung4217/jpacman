package nl.tudelft.jpacman.npc.ghost;

import nl.tudelft.jpacman.npc.Ghost;
import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class GhostFactoryTest {
    private static final PacManSprites SPRITE_STORE = new PacManSprites();
    private GhostFactory factory = new GhostFactory(SPRITE_STORE);
    private Ghost ghost;
    @Test
    void testGhostFactoryConstructor(){
        GhostFactory testConstuct = new GhostFactory(SPRITE_STORE);
        assertThat(testConstuct.equals(SPRITE_STORE));
    }
    @Test
    void testCreateBlinky() {
        Ghost tempGhost = factory.createInky();
        ghost = factory.createBlinky();
        assertThat(ghost != (tempGhost.getSprite()));
    }
}
