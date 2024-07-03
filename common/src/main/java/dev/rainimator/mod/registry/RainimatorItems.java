package dev.rainimator.mod.registry;

import dev.rainimator.mod.RainimatorMod;
import dev.rainimator.mod.impl.NetherTheCrownItem;
import dev.rainimator.mod.impl.WingsOfSalvationItem;
import dev.rainimator.mod.item.*;
import dev.rainimator.mod.item.armor.*;
import dev.rainimator.mod.item.shield.NetheriteShieldItem;
import dev.rainimator.mod.item.shield.SnowShieldItem;
import dev.rainimator.mod.item.sword.*;
import dev.rainimator.mod.item.tool.HerobrineDiamondPickaxeItem;
import dev.rainimator.mod.item.tool.IntelligenceTomahawkItem;
import dev.rainimator.mod.registry.util.FoilSwordItemBase;
import dev.rainimator.mod.registry.util.ItemBase;
import dev.rainimator.mod.registry.util.MusicItemBase;
import dev.rainimator.mod.registry.util.ToolMaterialUtil;
import me.shedaniel.architectury.registry.DeferredRegister;
import me.shedaniel.architectury.registry.RegistrySupplier;
import me.shedaniel.architectury.registry.fuel.FuelRegistry;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraft.util.registry.Registry;

import java.util.function.Supplier;

@SuppressWarnings("unused")
public class RainimatorItems {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(RainimatorMod.MOD_ID, Registry.ITEM_KEY);
    //resources
    public static final RegistrySupplier<Item> HIM_MUSIC = register("him_music", () -> new MusicItemBase("him_music_boss"));
    public static final RegistrySupplier<Item> CERIS_MUSIC = register("ceris_music", () -> new MusicItemBase("ceris_boss_music"));
    public static final RegistrySupplier<Item> NULL_MUSIC = register("null_music", () -> new MusicItemBase("null_boss_music"));
    public static final RegistrySupplier<Item> BLACKBONE_MUSIC = register("blackbone_music", () -> new MusicItemBase("blackbone_boss_music"));
    public static final RegistrySupplier<Item> PIGLIN_KING_MUSIC = register("piglin_king_music", () -> new MusicItemBase("piglin_king_boss_music"));
    public static final RegistrySupplier<Item> NAEUS_MUSIC = register("naeus_music", () -> new MusicItemBase("naeus_boss_music"));
    public static final RegistrySupplier<Item> GLUTTON_MUSIC = register("glutton_music", () -> new MusicItemBase("glutton_boss_music"));
    public static final RegistrySupplier<Item> HIM_ONE_LIVES = register("him_one_lives", () -> new MusicItemBase("him_one_lives"));
    public static final RegistrySupplier<Item> KRALOS_MUSIC = register("kralos_music", () -> new MusicItemBase("kralos_boss_music"));
    public static final RegistrySupplier<Item> KLAUS_MUSIC = register("klaus_music", () -> new MusicItemBase("klaus_boss_music"));
    //tool
    public static final RegistrySupplier<Item> ABIGAIL_SPEAR = register("abigail_spear", AbigailSpearItem::new);
    public static final RegistrySupplier<Item> GLUTTON_SLEDGE_HAMMER = register("glutton_sledge_hammer", () -> new SwordItem(ToolMaterialUtil.of(1000, 2.0F, 8.0F, 0, 15, SUPER_RUBY), 3, -2.2F, new Item.Settings().fireproof().arch$tab(RainimatorItemGroups.MAIN)));
    public static final RegistrySupplier<Item> RED_GOLD_DAGGER = register("red_gold_dagger", RedGoldDaggerItem::new);
    public static final RegistrySupplier<Item> BLACKBONE_THE_BLADE = register("blackbone_the_blade", BlackBoneTheBladeItem::new);
    public static final RegistrySupplier<Item> BLACKBONE_THE_BLADE_SINGLE_HAND = register("blackbone_the_blade_single_hand", BlackBoneTheBladeSingleHandItem::new);
    public static final RegistrySupplier<Item> RAIN_SWORD = register("rain_sword", RainSwordItem::new);
    public static final RegistrySupplier<Item> HEROBRINE_TOMAHAWK = register("herobrine_tomahawk", HerobrineTomahawkItem::new);
    public static final RegistrySupplier<Item> ZECANIRN_THE_BLADE = register("zecanirn_the_blade", ZecanirnTheBladeItem::new);
    public static final RegistrySupplier<Item> ENDER_BIG_SWORD = register("ender_big_sword", EnderBigSwordItem::new);
    public static final RegistrySupplier<Item> LASER_SWORD = register("laser_sword", () -> new FoilSwordItemBase(ToolMaterialUtil.of(3000, 4.0F, 13.0F, 1, 18, RainimatorItems.SUPER_SAPPHIRE, () -> Items.ENDER_EYE), 3, -2.4F, new Item.Settings().arch$tab(RainimatorItemGroups.MAIN)));
    public static final RegistrySupplier<Item> MACE = register("mace", () -> new SwordItem(ToolMaterialUtil.of(12000, 4.0F, 10.0F, 0, 10, RainimatorItems.SUPER_SAPPHIRE), 3, -2.6F, new Item.Settings().fireproof().arch$tab(RainimatorItemGroups.MAIN)));
    public static final RegistrySupplier<Item> PATRICK_HELMET = register("patrick_helmet", () -> new PatrickArmorItem(ArmorItem.Type.HELMET));
    public static final RegistrySupplier<Item> PATRICK_CHESTPLATE = register("patrick_chestplate", () -> new PatrickArmorItem(ArmorItem.Type.CHESTPLATE));
    public static final RegistrySupplier<Item> PATRICK_LEGGINGS = register("patrick_leggings", () -> new PatrickArmorItem(ArmorItem.Type.LEGGINGS));
    public static final RegistrySupplier<Item> PATRICK_BOOTS = register("patrick_boots", () -> new PatrickArmorItem(ArmorItem.Type.BOOTS));
    public static final RegistrySupplier<Item> INTELLIGENCE_TOMAHAWK = register("intelligence_tomahawk", IntelligenceTomahawkItem::new);
    public static final RegistrySupplier<Item> GENERAL_PATRICK_LONG_KNIVES = register("general_patrick_long_knives", () -> new SwordItem(ToolMaterialUtil.of(2500, 4.0F, 7.0F, 0, 5, SAPPHIRE), 3, -2.0F, new Item.Settings().fireproof().arch$tab(RainimatorItemGroups.MAIN)));
    public static final RegistrySupplier<Item> SOLDIERS_HALBERD = register("soldiers_halberd", () -> new SwordItem(ToolMaterialUtil.of(1500, 4.0F, 7.0F, 0, 5, SAPPHIRE), 3, -2.0F, new Item.Settings().arch$tab(RainimatorItemGroups.MAIN)));
    public static final RegistrySupplier<Item> SOLDIERS_WAR_HAMMER = register("soldiers_war_hammer", () -> new SwordItem(ToolMaterialUtil.of(2000, 4.0F, 6.0F, 0, 5, SAPPHIRE), 3, -2.2F, new Item.Settings().arch$tab(RainimatorItemGroups.MAIN)));
    public static final RegistrySupplier<Item> THE_BLUE_DAGGER = register("the_blue_dagger", () -> new SwordItem(ToolMaterialUtil.of(2000, 4.0F, 5.0F, 1, 10, RainimatorItems.SAPPHIRE), 3, -2.0F, new Item.Settings().arch$tab(RainimatorItemGroups.MAIN)));
    public static final RegistrySupplier<Item> HOT_GLOVES = register("hot_gloves", HotGlovesItem::new);
    public static final RegistrySupplier<Item> HEROBRINE_CHESTPLATE = register("herobrine_chestplate", () -> new HerobrineArmorItem(ArmorItem.Type.CHESTPLATE));
    public static final RegistrySupplier<Item> DIAMOND_LANCE = register("diamond_lance", DiamondLanceItem::new);
    public static final RegistrySupplier<Item> DIAMOND_HATCHET = register("diamond_hatchet", () -> new AxeItem(ToolMaterialUtil.of(1500, 4.0F, 5.0F, 2, 2, BLUE_DIAMOND), 1.0F, -2.0F, new Item.Settings().arch$tab(RainimatorItemGroups.MAIN)));
    public static final RegistrySupplier<Item> WINGS_OF_SALVATION = register("wings_of_salvation", WingsOfSalvationItem::create);
    public static final RegistrySupplier<Item> CHIEF_OF_THE_PIG_PEOPLE_HELMET = register("chief_of_the_pig_people_helmet", () -> new ChiefOfThePigPeopleArmorItem(ArmorItem.Type.HELMET));
    public static final RegistrySupplier<Item> CHIEF_OF_THE_PIG_PEOPLE_CHESTPLATE = register("chief_of_the_pig_people_chestplate", () -> new ChiefOfThePigPeopleArmorItem(ArmorItem.Type.CHESTPLATE));
    public static final RegistrySupplier<Item> CHIEF_OF_THE_PIG_PEOPLE_LEGGINGS = register("chief_of_the_pig_people_leggings", () -> new ChiefOfThePigPeopleArmorItem(ArmorItem.Type.LEGGINGS));
    public static final RegistrySupplier<Item> CHIEF_OF_THE_PIG_PEOPLE_BOOTS = register("chief_of_the_pig_people_boots", () -> new ChiefOfThePigPeopleArmorItem(ArmorItem.Type.BOOTS));
    public static final RegistrySupplier<Item> SOLDIERS_ARMOR_HELMET = register("soldiers_armor_helmet", () -> new SoldiersArmorItem(ArmorItem.Type.HELMET));
    public static final RegistrySupplier<Item> SOLDIERS_ARMOR_CHESTPLATE = register("soldiers_armor_chestplate", () -> new SoldiersArmorItem(ArmorItem.Type.CHESTPLATE));
    public static final RegistrySupplier<Item> SOLDIERS_ARMOR_LEGGINGS = register("soldiers_armor_leggings", () -> new SoldiersArmorItem(ArmorItem.Type.LEGGINGS));
    public static final RegistrySupplier<Item> SOLDIERS_ARMOR_BOOTS = register("soldiers_armor_boots", () -> new SoldiersArmorItem(ArmorItem.Type.BOOTS));
    public static final RegistrySupplier<Item> RAIN_CHESTPLATE = register("rain_chestplate", () -> new RainArmorItem(ArmorItem.Type.CHESTPLATE));
    public static final RegistrySupplier<Item> MAGIC_HAT = register("magic_hat", () -> new ItemBase(p -> p.arch$tab(RainimatorItemGroups.MAIN)));
    public static final RegistrySupplier<Item> NETHER_THE_CROWN = register("nether_the_crown", NetherTheCrownItem::create);
    public static final RegistrySupplier<Item> GLUTTON_HELMET = register("glutton_helmet", () -> new ItemBase(p -> p.arch$tab(RainimatorItemGroups.MAIN)));
    public static final RegistrySupplier<Item> PIGLIN_KING_CROWN = register("piglin_king_crown", () -> new ItemBase(p -> p.arch$tab(RainimatorItemGroups.MAIN)));
    public static final RegistrySupplier<Item> KING_NORMAL_CROWN = register("king_normal_crown", () -> new ItemBase(p -> p.arch$tab(RainimatorItemGroups.MAIN)));
    public static final RegistrySupplier<Item> PORKSHIRE_KING_CROWN = register("porkshire_king_crown", () -> new ItemBase(p -> p.arch$tab(RainimatorItemGroups.MAIN)));
    public static final RegistrySupplier<Item> HEROBRINE_DIAMOND_PICKAXE = register("herobrine_diamond_pickaxe", HerobrineDiamondPickaxeItem::new);
    public static final RegistrySupplier<Item> NAEUS_SWORD = register("naeus_sword", NaeusSwordItem::new);
    public static final RegistrySupplier<Item> NETHER_SPEAR = register("nether_spear", NetherSpearItem::new);
    public static final RegistrySupplier<Item> NETHERITE_FLAME_SABER = register("netherite_flame_saber", NetheriteFlameSaberItem::new);
    public static final RegistrySupplier<Item> END_STAFF = register("end_staff", EndStaffItem::new);
    public static final RegistrySupplier<Item> LIGHT_SWORD = register("light_sword", () -> new FoilSwordItemBase(ToolMaterialUtil.of(200, 0.0F, 5.0F, 0, 25), 3, -2.2F, new Item.Settings().fireproof().arch$tab(RainimatorItemGroups.MAIN)));
    public static final RegistrySupplier<Item> NETHERITE_SHIELD = register("netherite_shield", NetheriteShieldItem::new);
    public static final RegistrySupplier<Item> SNOW_SHIELD = register("snow_shield", SnowShieldItem::new);
    public static final RegistrySupplier<Item> FALLEN_SOUL_AXE = register("fallen_soul_axe", FallenSoulAxeItem::new);
    public static final RegistrySupplier<Item> SEIZING_SHADOW_HALBERD = register("seizing_shadow_halberd", SeizingShadowHalberdItem::new);
    public static final RegistrySupplier<Item> COTTON_CANDY = register("cotton_candy", CottonCandyItem::new);
    public static final RegistrySupplier<Item> ENDER_CURVED_SWORD = register("ender_curved_sword", EnderCurvedSwordItem::new);
    public static final RegistrySupplier<Item> BLACK_GUN = register("black_gun", BlackGunItem::new);
    public static final RegistrySupplier<Item> BLACK_DEATH_SWORD = register("black_death_sword", BlackDeathSwordItem::new);
    public static final RegistrySupplier<Item> RAIN_LASER_SWORD = register("rain_lazyed_sword", () -> new FoilSwordItemBase(ToolMaterialUtil.of(1500, 0.0F, 8.0F, 0, 15), 3, -2.0F, new Item.Settings().arch$tab(RainimatorItemGroups.MAIN)));
    public static final RegistrySupplier<Item> KING_ZOMBIE_PIG_MAN_SWORD = register("king_zombie_pig_man_sword", () -> new SwordItem(ToolMaterialUtil.of(500, 0.0F, 6.0F, 0, 25, () -> Items.GOLD_INGOT), 3, -2.3F, new Item.Settings().arch$tab(RainimatorItemGroups.MAIN)));
    public static final RegistrySupplier<Item> EMERALD_BLADE = register("emerald_blade", () -> new SwordItem(ToolMaterialUtil.of(1200, 4.0F, 5.0F, 0, 3, () -> Blocks.EMERALD_BLOCK), 3, -2.2F, new Item.Settings().fireproof().arch$tab(RainimatorItemGroups.MAIN)));
    public static final RegistrySupplier<Item> BLADE_OF_THE_WHIRLWIND = register("blade_of_the_whirlwind", () -> new SwordItem(ToolMaterialUtil.of(2500, 4.0F, 6.0F, 0, 2, () -> Blocks.OAK_LEAVES), 3, -2.8F, new Item.Settings().arch$tab(RainimatorItemGroups.MAIN)));
    public static final RegistrySupplier<Item> SNOW_DIAMOND_SWORD = register("snow_diamond_sword", () -> new SwordItem(ToolMaterialUtil.of(3000, 4.0F, 6.0F, 0, 2, () -> Blocks.SNOW_BLOCK), 3, -2.0F, new Item.Settings().arch$tab(RainimatorItemGroups.MAIN)));
    public static final RegistrySupplier<Item> NETHER_SICKLE = register("nether_sickle", () -> new SwordItem(ToolMaterialUtil.of(2000, 4.0F, 3.0F, 1, 2, () -> Blocks.STRIPPED_WARPED_STEM), 3, -2.0F, new Item.Settings().arch$tab(RainimatorItemGroups.MAIN)));
    public static final RegistrySupplier<Item> THE_GOLDEN_SWORD = register("the_golden_sword", () -> new SwordItem(ToolMaterialUtil.of(3000, 4.0F, 6.0F, 1, 5, () -> Blocks.GOLD_BLOCK), 3, -2.0F, new Item.Settings().fireproof().arch$tab(RainimatorItemGroups.MAIN)));
    public static final RegistrySupplier<Item> DEEP_SICKLE = register("deep_sickle", () -> new SwordItem(ToolMaterialUtil.of(1000, 4.0F, 6.0F, 1, 2, () -> Blocks.MOSS_BLOCK), 3, -2.4F, new Item.Settings().arch$tab(RainimatorItemGroups.MAIN)));
    public static final RegistrySupplier<Item> IRON_DAGGER = register("iron_dagger", () -> new SwordItem(ToolMaterialUtil.of(1400, 4.0F, 7.0F, 1, 8, Blocks.IRON_BLOCK::asItem, () -> Items.IRON_INGOT), 3, -2.0F, new Item.Settings().arch$tab(RainimatorItemGroups.MAIN)));
    public static final RegistrySupplier<Item> DEEP_WAR_HAMMER = register("deep_war_hammer", () -> new SwordItem(ToolMaterialUtil.of(1500, 0.0F, 8.0F, 0, 5), 3, -2.3F, new Item.Settings().arch$tab(RainimatorItemGroups.MAIN)));
    public static final RegistrySupplier<Item> SKULL_CRUSHER = register("skull_crusher", () -> new SwordItem(ToolMaterialUtil.of(1500, 0.0F, 7.0F, 0, 15), 3, -2.2F, new Item.Settings().fireproof().arch$tab(RainimatorItemGroups.MAIN)));
    public static final RegistrySupplier<Item> IRON_LONG_SPEAR = register("iron_long_spear", () -> new SwordItem(ToolMaterialUtil.of(500, 0.0F, 3.0F, 0, 1), 3, -2.2F, new Item.Settings().arch$tab(RainimatorItemGroups.MAIN)));
    public static final RegistrySupplier<Item> GOLDEN_PLUNDERING_AXE = register("golden_plundering_axe", () -> new SwordItem(ToolMaterialUtil.of(1200, 0.0F, 5.0F, 0, 10), 3, -2.2F, new Item.Settings().arch$tab(RainimatorItemGroups.MAIN)));
    public static final RegistrySupplier<Item> PLUNDERING_THE_GIANT_AXE = register("plundering_the_giant_axe", () -> new SwordItem(ToolMaterialUtil.of(1300, 0.0F, 7.0F, 0, 8), 3, -2.2F, new Item.Settings().arch$tab(RainimatorItemGroups.MAIN)));
    public static final RegistrySupplier<Item> LIGHT_SWORD_EVER = register("light_sword_ever", () -> new SwordItem(ToolMaterialUtil.of(1000, 0.0F, 8.0F, 0, 30), 3, -2.0F, new Item.Settings().arch$tab(RainimatorItemGroups.MAIN)));
    public static final RegistrySupplier<Item> DIAMOND_BIG_SWORD = register("diamond_big_sword", () -> new SwordItem(ToolMaterialUtil.of(2000, 0.0F, 9.0F, 0, 15), 3, -2.3F, new Item.Settings().arch$tab(RainimatorItemGroups.MAIN)));
    public static final RegistrySupplier<Item> SOLDIER_SPEAR = register("soldier_spear", () -> new SwordItem(ToolMaterialUtil.of(1000, 0.0F, 5.0F, 0, 10), 3, -2.2F, new Item.Settings().arch$tab(RainimatorItemGroups.MAIN)));
    public static final RegistrySupplier<Item> SOUL_RAIDING_HAMMER = register("soul_raiding_hammer", () -> new SwordItem(ToolMaterialUtil.of(2000, 0.0F, 10.0F, 0, 20), 3, -2.2F, new Item.Settings().arch$tab(RainimatorItemGroups.MAIN)));
    public static final RegistrySupplier<Item> KATANA = register("katana", () -> new SwordItem(ToolMaterialUtil.of(1000, 0.0F, 6.0F, 0, 10), 3, -2.0F, new Item.Settings().arch$tab(RainimatorItemGroups.MAIN)));
    public static final RegistrySupplier<Item> AMETHYST_WAR_HAMMER = register("amethyst_war_hammer", () -> new SwordItem(ToolMaterialUtil.of(1500, 0.0F, 9.0F, 0, 25), 3, -2.0F, new Item.Settings().arch$tab(RainimatorItemGroups.MAIN)));

    private static <T extends Item> RegistrySupplier<T> register(String name, Supplier<T> item) {

        return REGISTRY.register(name, item);
    }

    public static void init() {
    }
}