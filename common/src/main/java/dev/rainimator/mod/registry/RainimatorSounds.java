package dev.rainimator.mod.registry;

import com.iafenvoy.neptune.util.function.MemorizeSupplier;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.rainimator.mod.RainimatorMod;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class RainimatorSounds {
    public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(RainimatorMod.MOD_ID, RegistryKeys.SOUND_EVENT);

    public static final String[] idMap = new String[]{
            "blackbone", "ceris_live", "ceris_skill", "ceris_f", "him_skill", "naeus_living", "fire_soul", "rain_sword_skill", "rain_sword_skill_2",
            "blackbone_living", "blackbone_skill", "naeus_roll", "ceris_death", "naeus_sword_1", "power_skill", "under_flower",
            "sword_teleport1", "sword_teleport2", "sword_teleport3", "sword_teleport4",
            "black_death_sword_skill", "black_death_sword_skills", "black_death_sword_skill_3",
            "gift_box", "him", "stunned",
            "blued_diamond_skill_1", "blue_diamond_skill_2", "blue_diamond_skill_3", "blue_diamond_skill_4",
            "ceris_boss_music", "null_boss_music", "blackbone_boss_music", "piglin_king_boss_music", "naeus_boss_music",
            "glutton_boss_music", "him_music_boss", "him_one_lives", "kralos_boss_music", "klaus_boss_music"
    };
    public static final Map<String, Supplier<SoundEvent>> REGISTRY_MAP = new HashMap<>();

    public static final RegistrySupplier<SoundEvent> BLACKBONE = register("blackbone");
    public static final RegistrySupplier<SoundEvent> CERIS_LIVE = register("ceris_live");
    public static final RegistrySupplier<SoundEvent> CERIS_SKILL = register("ceris_skill");
    public static final RegistrySupplier<SoundEvent> CERIS_F = register("ceris_f");
    public static final RegistrySupplier<SoundEvent> HIM_SKILL = register("him_skill");
    public static final RegistrySupplier<SoundEvent> NAEUS_LIVING = register("naeus_living");
    public static final RegistrySupplier<SoundEvent> FIRE_SOUL = register("fire_soul");
    public static final RegistrySupplier<SoundEvent> RAIN_SWORD_SKILL = register("rain_sword_skill");
    public static final RegistrySupplier<SoundEvent> RAIN_SWORD_SKILL_2 = register("rain_sword_skill_2");
    public static final RegistrySupplier<SoundEvent> BLACKBONE_LIVING = register("blackbone_living");
    public static final RegistrySupplier<SoundEvent> BLACKBONE_SKILL = register("blackbone_skill");
    public static final RegistrySupplier<SoundEvent> NAEUS_ROLL = register("naeus_roll");
    public static final RegistrySupplier<SoundEvent> CERIS_DEATH = register("ceris_death");
    public static final RegistrySupplier<SoundEvent> NAEUS_SWORD_1 = register("naeus_sword_1");
    public static final RegistrySupplier<SoundEvent> POWER_SKILL = register("power_skill");
    public static final RegistrySupplier<SoundEvent> UNDER_FLOWER = register("under_flower");
    public static final RegistrySupplier<SoundEvent> SWORD_TELEPORT1 = register("sword_teleport1");
    public static final RegistrySupplier<SoundEvent> SWORD_TELEPORT2 = register("sword_teleport2");
    public static final RegistrySupplier<SoundEvent> SWORD_TELEPORT3 = register("sword_teleport3");
    public static final RegistrySupplier<SoundEvent> SWORD_TELEPORT4 = register("sword_teleport4");
    public static final RegistrySupplier<SoundEvent> BLACK_DEATH_SWORD_SKILL = register("black_death_sword_skill");
    public static final RegistrySupplier<SoundEvent> BLACK_DEATH_SWORD_SKILLS = register("black_death_sword_skills");
    public static final RegistrySupplier<SoundEvent> BLACK_DEATH_SWORD_SKILL_3 = register("black_death_sword_skill_3");
    public static final RegistrySupplier<SoundEvent> GIFT_BOX = register("gift_box");
    public static final RegistrySupplier<SoundEvent> HIM = register("him");
    public static final RegistrySupplier<SoundEvent> STUNNED = register("stunned");
    public static final RegistrySupplier<SoundEvent> BLUED_DIAMOND_SKILL_1 = register("blued_diamond_skill_1");
    public static final RegistrySupplier<SoundEvent> BLUE_DIAMOND_SKILL_2 = register("blue_diamond_skill_2");
    public static final RegistrySupplier<SoundEvent> BLUE_DIAMOND_SKILL_3 = register("blue_diamond_skill_3");
    public static final RegistrySupplier<SoundEvent> BLUE_DIAMOND_SKILL_4 = register("blue_diamond_skill_4");
    public static final RegistrySupplier<SoundEvent> CERIS_BOSS_MUSIC = register("ceris_boss_music");
    public static final RegistrySupplier<SoundEvent> NULL_BOSS_MUSIC = register("null_boss_music");
    public static final RegistrySupplier<SoundEvent> BLACKBONE_BOSS_MUSIC = register("blackbone_boss_music");
    public static final RegistrySupplier<SoundEvent> PIGLIN_KING_BOSS_MUSIC = register("piglin_king_boss_music");
    public static final RegistrySupplier<SoundEvent> NAEUS_BOSS_MUSIC = register("naeus_boss_music");
    public static final RegistrySupplier<SoundEvent> GLUTTON_BOSS_MUSIC = register("glutton_boss_music");
    public static final RegistrySupplier<SoundEvent> HIM_MUSIC_BOSS = register("him_music_boss");
    public static final RegistrySupplier<SoundEvent> HIM_ONE_LIVES = register("him_one_lives");
    public static final RegistrySupplier<SoundEvent> KRALOS_BOSS_MUSIC = register("kralos_boss_music");
    public static final RegistrySupplier<SoundEvent> KLAUS_BOSS_MUSIC = register("klaus_boss_music");

    public static RegistrySupplier<SoundEvent> register(String id) {
        return REGISTRY.register(id, () -> SoundEvent.of(Identifier.of(RainimatorMod.MOD_ID, id)));
    }

    static {
        for (String id : idMap) {
            Identifier location = Identifier.of(RainimatorMod.MOD_ID, id);
            MemorizeSupplier<SoundEvent> soundEvent = new MemorizeSupplier<>(() -> SoundEvent.of(location));
            REGISTRY.register(id, soundEvent);
            REGISTRY_MAP.put(id, soundEvent);
        }
    }
}