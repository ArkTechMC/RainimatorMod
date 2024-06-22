package dev.rainimator.mod.registry;

import dev.architectury.registry.fuel.FuelRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.rainimator.mod.RainimatorMod;
import dev.rainimator.mod.impl.NetherTheCrownItem;
import dev.rainimator.mod.impl.WingsOfSalvationItem;
import dev.rainimator.mod.item.*;
import dev.rainimator.mod.item.armor.*;
import dev.rainimator.mod.item.shield.BlueDiamondShieldItem;
import dev.rainimator.mod.item.shield.NetheriteShieldItem;
import dev.rainimator.mod.item.shield.SnowShieldItem;
import dev.rainimator.mod.item.sword.*;
import dev.rainimator.mod.item.tool.*;
import dev.rainimator.mod.registry.util.FoilItemBase;
import dev.rainimator.mod.registry.util.FoilSwordItemBase;
import dev.rainimator.mod.registry.util.ItemBase;
import dev.rainimator.mod.registry.util.ToolMaterialUtil;
import dev.rainimator.mod.registry.util.MusicItemBase;
import dev.rainimator.mod.registry.util.SpawnEggBase;
import dev.rainimator.mod.util.Episode;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Rarity;

import java.util.function.Supplier;

@SuppressWarnings("unused")
public class RainimatorItems {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(RainimatorMod.MOD_ID, RegistryKeys.ITEM);
    //resources
    public static final RegistrySupplier<Item> RAW_RUBY = register("raw_ruby", () -> new ItemBase(p -> p.arch$tab(RainimatorItemGroups.ITEM)));
    public static final RegistrySupplier<Item> RUBY = register("ruby", () -> new ItemBase(p -> p.arch$tab(RainimatorItemGroups.ITEM)));
    public static final RegistrySupplier<Item> SUPER_RUBY = register("super_ruby", () -> new ItemBase(p -> p.fireproof().arch$tab(RainimatorItemGroups.ITEM)));
    public static final RegistrySupplier<Item> RAW_SAPPHIRE = register("raw_sapphire", () -> new ItemBase(p -> p.arch$tab(RainimatorItemGroups.ITEM)));
    public static final RegistrySupplier<Item> SAPPHIRE = register("sapphire", () -> new ItemBase(p -> p.arch$tab(RainimatorItemGroups.ITEM)));
    public static final RegistrySupplier<Item> SUPER_SAPPHIRE = register("super_sapphire", () -> new ItemBase(p -> p.fireproof().arch$tab(RainimatorItemGroups.ITEM)));
    public static final RegistrySupplier<Item> RAW_SUGILITE = register("raw_sugilite", () -> new ItemBase(p -> p.arch$tab(RainimatorItemGroups.ITEM)));
    public static final RegistrySupplier<Item> SUGILITE = register("sugilite", () -> new ItemBase(p -> p.arch$tab(RainimatorItemGroups.ITEM)));
    public static final RegistrySupplier<Item> SUPER_SUGILITE = register("super_sugilite", () -> new ItemBase(p -> p.fireproof().arch$tab(RainimatorItemGroups.ITEM)));
    public static final RegistrySupplier<Item> RAW_TOPAZ = register("raw_topaz", () -> new ItemBase(p -> p.arch$tab(RainimatorItemGroups.ITEM)));
    public static final RegistrySupplier<Item> TOPAZ = register("topaz", () -> new ItemBase(p -> p.arch$tab(RainimatorItemGroups.ITEM)));
    public static final RegistrySupplier<Item> SUPER_TOPAZ = register("super_topaz", () -> new ItemBase(p -> p.fireproof().arch$tab(RainimatorItemGroups.ITEM)));
    public static final RegistrySupplier<Item> RUBY_HELMET = register("ruby_helmet", () -> new RubyArmorItem(ArmorItem.Type.HELMET));
    public static final RegistrySupplier<Item> RUBY_CHESTPLATE = register("ruby_chestplate", () -> new RubyArmorItem(ArmorItem.Type.CHESTPLATE));
    public static final RegistrySupplier<Item> RUBY_LEGGINGS = register("ruby_leggings", () -> new RubyArmorItem(ArmorItem.Type.LEGGINGS));
    public static final RegistrySupplier<Item> RUBY_BOOTS = register("ruby_boots", () -> new RubyArmorItem(ArmorItem.Type.BOOTS));
    public static final RegistrySupplier<Item> SAPPHIRE_HELMET = register("sapphire_helmet", () -> new SapphireArmorItem(ArmorItem.Type.HELMET));
    public static final RegistrySupplier<Item> SAPPHIRE_CHESTPLATE = register("sapphire_chestplate", () -> new SapphireArmorItem(ArmorItem.Type.CHESTPLATE));
    public static final RegistrySupplier<Item> SAPPHIRE_LEGGINGS = register("sapphire_leggings", () -> new SapphireArmorItem(ArmorItem.Type.LEGGINGS));
    public static final RegistrySupplier<Item> SAPPHIRE_BOOTS = register("sapphire_boots", () -> new SapphireArmorItem(ArmorItem.Type.BOOTS));
    public static final RegistrySupplier<Item> SUGILITE_HELMET = register("sugilite_helmet", () -> new SugiliteArmorItem(ArmorItem.Type.HELMET));
    public static final RegistrySupplier<Item> SUGILITE_CHESTPLATE = register("sugilite_chestplate", () -> new SugiliteArmorItem(ArmorItem.Type.CHESTPLATE));
    public static final RegistrySupplier<Item> SUGILITE_LEGGINGS = register("sugilite_leggings", () -> new SugiliteArmorItem(ArmorItem.Type.LEGGINGS));
    public static final RegistrySupplier<Item> SUGILITE_BOOTS = register("sugilite_boots", () -> new SugiliteArmorItem(ArmorItem.Type.BOOTS));
    public static final RegistrySupplier<Item> TOPAZ_HELMET = register("topaz_helmet", () -> new TopazArmorItem(ArmorItem.Type.HELMET));
    public static final RegistrySupplier<Item> TOPAZ_CHESTPLATE = register("topaz_chestplate", () -> new TopazArmorItem(ArmorItem.Type.CHESTPLATE));
    public static final RegistrySupplier<Item> TOPAZ_LEGGINGS = register("topaz_leggings", () -> new TopazArmorItem(ArmorItem.Type.LEGGINGS));
    public static final RegistrySupplier<Item> TOPAZ_BOOTS = register("topaz_boots", () -> new TopazArmorItem(ArmorItem.Type.BOOTS));
    public static final RegistrySupplier<Item> RUBY_SWORD = register("ruby_sword", RubyTools.Sword::new);
    public static final RegistrySupplier<Item> RUBY_AXE = register("ruby_axe", RubyTools.Axe::new);
    public static final RegistrySupplier<Item> RUBY_PICKAXE = register("ruby_pickaxe", RubyTools.Pickaxe::new);
    public static final RegistrySupplier<Item> RUBY_SHOVEL = register("ruby_shovel", RubyTools.Shovel::new);
    public static final RegistrySupplier<Item> RUBY_HOE = register("ruby_hoe", RubyTools.Hoe::new);
    public static final RegistrySupplier<Item> SAPPHIRE_SWORD = register("sapphire_sword", SapphireTools.Sword::new);
    public static final RegistrySupplier<Item> SAPPHIRE_AXE = register("sapphire_axe", SapphireTools.Axe::new);
    public static final RegistrySupplier<Item> SAPPHIRE_PICKAXE = register("sapphire_pickaxe", SapphireTools.Pickaxe::new);
    public static final RegistrySupplier<Item> SAPPHIRE_SHOVEL = register("sapphire_shovel", SapphireTools.Shovel::new);
    public static final RegistrySupplier<Item> SAPPHIRE_HOE = register("sapphire_hoe", SapphireTools.Hoe::new);
    public static final RegistrySupplier<Item> SUGILITE_SWORD = register("sugilite_sword", SugiliteTools.Sword::new);
    public static final RegistrySupplier<Item> SUGILITE_AXE = register("sugilite_axe", SugiliteTools.Axe::new);
    public static final RegistrySupplier<Item> SUGILITE_PICKAXE = register("sugilite_pickaxe", SugiliteTools.Pickaxe::new);
    public static final RegistrySupplier<Item> SUGILITE_SHOVEL = register("sugilite_shovel", SugiliteTools.Shovel::new);
    public static final RegistrySupplier<Item> SUGILITE_HOE = register("sugilite_hoe", SugiliteTools.Hoe::new);
    public static final RegistrySupplier<Item> TOPAZ_SWORD = register("topaz_sword", TopazTools.Sword::new);
    public static final RegistrySupplier<Item> TOPAZ_AXE = register("topaz_axe", TopazTools.Axe::new);
    public static final RegistrySupplier<Item> TOPAZ_PICKAXE = register("topaz_pickaxe", TopazTools.Pickaxe::new);
    public static final RegistrySupplier<Item> TOPAZ_SHOVEL = register("topaz_shovel", TopazTools.Shovel::new);
    public static final RegistrySupplier<Item> TOPAZ_HOE = register("topaz_hoe", TopazTools.Hoe::new);
    public static final RegistrySupplier<Item> HOT_IRON = register("hot_iron", () -> new ItemBase(p -> p.arch$tab(RainimatorItemGroups.ITEM)));
    public static final RegistrySupplier<Item> GEMSTONE_MIXTURE = register("gemstone_mixture", () -> new FoilItemBase(p -> p.maxCount(1).rarity(Rarity.EPIC).arch$tab(RainimatorItemGroups.ITEM)));
    public static final RegistrySupplier<Item> BLUE_DIAMOND = register("blue_diamond", BlueDiamondItem::new);
    public static final RegistrySupplier<Item> BLUE_DIAMOND_SWORD = register("blue_diamond_sword", BlueDiamondSwordItem::new);
    public static final RegistrySupplier<Item> BLUE_DIAMOND_HELMET = register("blue_diamond_helmet", () -> new BlueDiamondArmorsItem(ArmorItem.Type.HELMET));
    public static final RegistrySupplier<Item> BLUE_DIAMOND_CHESTPLATE = register("blue_diamond_chestplate", () -> new BlueDiamondArmorsItem(ArmorItem.Type.CHESTPLATE));
    public static final RegistrySupplier<Item> BLUE_DIAMOND_LEGGINGS = register("blue_diamond_leggings", () -> new BlueDiamondArmorsItem(ArmorItem.Type.LEGGINGS));
    public static final RegistrySupplier<Item> BLUE_DIAMOND_BOOTS = register("blue_diamond_boots", () -> new BlueDiamondArmorsItem(ArmorItem.Type.BOOTS));
    public static final RegistrySupplier<Item> BLUE_DIAMOND_SHIELD = register("blue_diamond_shield", BlueDiamondShieldItem::new);
    public static final RegistrySupplier<Item> WITHER_BONE = register("wither_bone", () -> new ItemBase(p -> p.maxCount(16).fireproof().arch$tab(RainimatorItemGroups.ITEM)));
    public static final RegistrySupplier<Item> NETHERITE_WITHER_BONE = register("netherite_wither_bone", () -> new FoilItemBase(p -> p.maxCount(16).fireproof().arch$tab(RainimatorItemGroups.ITEM)));
    public static final RegistrySupplier<Item> MAGIC_STAR = register("magic_star", () -> new ItemBase(p -> p.maxDamage(5).arch$tab(RainimatorItemGroups.ITEM)));
    public static final RegistrySupplier<Item> ICE_HEART = register("ice_heart", () -> new FoilItemBase(p -> p.maxCount(1).fireproof().rarity(Rarity.EPIC).arch$tab(RainimatorItemGroups.ITEM)));
    public static final RegistrySupplier<Item> WARRIOR_HEART = register("warrior_heart", () -> new FoilItemBase(p -> p.maxCount(1).fireproof().rarity(Rarity.EPIC).arch$tab(RainimatorItemGroups.ITEM)));
    public static final RegistrySupplier<Item> ENDER_HEART = register("ender_heart", () -> new FoilItemBase(p -> p.maxCount(1).fireproof().rarity(Rarity.EPIC).arch$tab(RainimatorItemGroups.ITEM)));
    public static final RegistrySupplier<Item> LIGHT_HEART = register("light_heart", () -> new FoilItemBase(p -> p.maxCount(1).fireproof().rarity(Rarity.EPIC).arch$tab(RainimatorItemGroups.ITEM)));
    public static final RegistrySupplier<Item> ICED_HEART = register("iced_heart", () -> new ItemBase(p -> p.maxCount(1).rarity(Rarity.UNCOMMON).arch$tab(RainimatorItemGroups.ITEM)));
    public static final RegistrySupplier<Item> ZOMBIE_HEART = register("zombie_heart", ZombieHeartItem::new);
    public static final RegistrySupplier<Item> DIAMOND_PIECE = register("diamond_piece", () -> new ItemBase(p -> p.arch$tab(RainimatorItemGroups.ITEM)));
    public static final RegistrySupplier<Item> BAO_ZHU = register("bao_zhu", () -> new FoilItemBase(p -> p.maxCount(32).rarity(Rarity.UNCOMMON).arch$tab(RainimatorItemGroups.ITEM)));
    public static final RegistrySupplier<Item> SOUL_PEOPLE = register("soul_people", () -> new FoilItemBase(p -> p.maxCount(32).rarity(Rarity.UNCOMMON).arch$tab(RainimatorItemGroups.ITEM)));
    public static final RegistrySupplier<Item> ENDER_STONE = register("ender_stone", () -> new FoilItemBase(p -> p.maxCount(1).fireproof().rarity(Rarity.UNCOMMON).arch$tab(RainimatorItemGroups.ITEM)));
    public static final RegistrySupplier<Item> NEAUS_SOULS = register("neaus_souls", () -> new FoilItemBase(p -> p.maxCount(32).fireproof().rarity(Rarity.EPIC).arch$tab(RainimatorItemGroups.ITEM)));
    public static final RegistrySupplier<Item> ENDER_BOOK = register("ender_book", EnderBookItem::new);
    public static final RegistrySupplier<Item> SUPER_DIAMOND_APPLE = register("super_diamond_apple", SuperDiamondAppleItem::new);
    public static final RegistrySupplier<Item> DIAMOND_APPLE_SUPPER = register("diamond_apple_supper", DiamondAppleSupperItem::new);
    public static final RegistrySupplier<Item> MAGIC_ENDER_PEARL = register("magic_ender_pearl", MagicEnderPearlItem::new);
    public static final RegistrySupplier<Item> MYSTERIOUS_GIFT_BOX = register("mysterious_gift_box", MysteriousGiftBoxItem::new);
    public static final RegistrySupplier<Item> SOUL_TOTEM = register("soul_totem", SoulTotemItem::new);
    public static final RegistrySupplier<Item> UNDER_FLOWER = register("under_flower", UnderFlowerItem::new);
    public static final RegistrySupplier<Item> NETHERITE_NUCLEAR_REACTOR = register("netherite_nuclear_reactor", NetherNuclearReactorItem::new);
    public static final RegistrySupplier<Item> NIGHTMARES = register("nightmares", NightmaresItem::new);
    public static final RegistrySupplier<Item> DIVINE_CORE = register("divine_core", DivineCoreItem::new);
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
    //entity
    public static final RegistrySupplier<Item> HEROBRINE_SPAWN_EGG = register("herobrine_spawn_egg", () -> new SpawnEggBase(Episode.TheStruggle, RainimatorEntities.HEROBRINE, -10092544, -65536));
    public static final RegistrySupplier<Item> CERIS_SPAWN_EGG = register("ceris_spawn_egg", () -> new SpawnEggBase(Episode.ColdAsIce, RainimatorEntities.CERIS, -10092442, -65281));
    public static final RegistrySupplier<Item> ZOMBIES_SPAWN_EGG = register("zombies_spawn_egg", () -> new SpawnEggBase(Episode.None, RainimatorEntities.ZOMBIES, -16724941, -16751104));
    public static final RegistrySupplier<Item> NAEUS_SPAWN_EGG = register("naeus_spawn_egg", () -> new SpawnEggBase(Episode.BeginAgain, RainimatorEntities.NAEUS, -10066330, -3355444));
    public static final RegistrySupplier<Item> RAIN_SPAWN_EGG = register("rain_spawn_egg", () -> new SpawnEggBase(Episode.TheStruggle, RainimatorEntities.RAIN, -16777063, -13408513));
    public static final RegistrySupplier<Item> ABIGAIL_SPAWN_EGG = register("abigail_spawn_egg", () -> new SpawnEggBase(Episode.BeginAgain, RainimatorEntities.ABIGAIL, -65332, -39169));
    public static final RegistrySupplier<Item> PATRICK_SPAWN_EGG = register("patrick_spawn_egg", () -> new SpawnEggBase(Episode.ColdAsIce, RainimatorEntities.PATRICK, -16737895, -13369345));
    public static final RegistrySupplier<Item> BLACKBONE_SPAWN_EGG = register("blackbone_spawn_egg", () -> new SpawnEggBase(Episode.WeAreTheDanger, RainimatorEntities.BLACKBONE, -16777216, -10066330));
    public static final RegistrySupplier<Item> HOGSWORTH_SPAWN_EGG = register("hogsworth_spawn_egg", () -> new SpawnEggBase(Episode.HardPillToSwallow, RainimatorEntities.HOGSWORTH, -26215, -13108));
    public static final RegistrySupplier<Item> CIARA_SPAWN_EGG = register("ciara_spawn_egg", () -> new SpawnEggBase(Episode.Nightmares, RainimatorEntities.CIARA, -52378, -39220));
    public static final RegistrySupplier<Item> HILDA_SPAWN_EGG = register("hilda_spawn_egg", () -> new SpawnEggBase(Episode.ColdAsIceRemake, RainimatorEntities.HILDA, -256, -3355444));
    public static final RegistrySupplier<Item> SOLDIERS_SPAWN_EGG = register("soldiers_spawn_egg", () -> new SpawnEggBase(Episode.None, RainimatorEntities.SOLDIERS, -1, -1));
    public static final RegistrySupplier<Item> WITHERED_SKELETONS_SPAWN_EGG = register("withered_skeletons_spawn_egg", () -> new SpawnEggBase(Episode.None, RainimatorEntities.WITHERED_SKELETONS, -13421773, -10066330));
    public static final RegistrySupplier<Item> DARK_SHIELD_SPAWN_EGG = register("dark_shield_spawn_egg", () -> new SpawnEggBase(Episode.None, RainimatorEntities.DARK_SHIELD, -6736897, -16777216));
    public static final RegistrySupplier<Item> DARK_ZOMBIE_SPAWN_EGG = register("dark_zombie_spawn_egg", () -> new SpawnEggBase(Episode.None, RainimatorEntities.DARK_ZOMBIE, -16751104, -13369549));
    public static final RegistrySupplier<Item> VORDUS_SPAWN_EGG = register("vordus_spawn_egg", () -> new SpawnEggBase(Episode.Goodbye, RainimatorEntities.VORDUS, -13421773, -3355648));
    public static final RegistrySupplier<Item> WITHER_SHIELD_SPAWN_EGG = register("wither_shield_spawn_egg", () -> new SpawnEggBase(Episode.None, RainimatorEntities.WITHER_SHIELD, -16777216, -1));
    public static final RegistrySupplier<Item> SKELETON_SNOW_SPAWN_EGG = register("skeleton_snow_spawn_egg", () -> new SpawnEggBase(Episode.None, RainimatorEntities.SKELETON_SNOW, -1, -13369345));
    public static final RegistrySupplier<Item> ZOMBIES_PIGLIN_KING_SPAWN_EGG = register("zombies_piglin_king_spawn_egg", () -> new SpawnEggBase(Episode.None, RainimatorEntities.ZOMBIE_PIGLIN_KING, -39424, -256));
    public static final RegistrySupplier<Item> PIGLIN_KING_ZOMBIES_SPAWN_EGG = register("piglin_king_zombies_spawn_egg", () -> new SpawnEggBase(Episode.None, RainimatorEntities.PIGLIN_KING_ZOMBIES, -26368, -52));
    public static final RegistrySupplier<Item> PIGLIN_KING_ZOMBIE_SPAWN_EGG = register("piglin_king_zombie_spawn_egg", () -> new SpawnEggBase(Episode.None, RainimatorEntities.PIGLIN_KING_ZOMBIE, -256, -13108));
    public static final RegistrySupplier<Item> PIGLIN_COMMANDER_SPAWN_EGG = register("piglin_commander_spawn_egg", () -> new SpawnEggBase(Episode.None, RainimatorEntities.PIGLIN_COMMANDER, -52, -256));
    public static final RegistrySupplier<Item> NAEUS_KING_SPAWN_EGG = register("naeus_king_spawn_egg", () -> new SpawnEggBase(Episode.None, RainimatorEntities.NAEUS_KING, -6737152, -65536));
    public static final RegistrySupplier<Item> TUSK_SPAWN_EGG = register("tusk_spawn_egg", () -> new SpawnEggBase(Episode.None, RainimatorEntities.TUSK, -13159, -13108));
    public static final RegistrySupplier<Item> BROTS_SPAWN_EGG = register("brots_spawn_egg", () -> new SpawnEggBase(Episode.None, RainimatorEntities.BROTS, -3399168, -9175040));
    public static final RegistrySupplier<Item> ZOMBIE_PIGLIN_ART_SPAWN_EGG = register("zombie_piglin_art_spawn_egg", () -> new SpawnEggBase(Episode.None, RainimatorEntities.ZOMBIE_PIGLIN_ART, -1343393, -412045));
    public static final RegistrySupplier<Item> MUTATED_SPAWN_EGG = register("mutated_spawn_egg", () -> new SpawnEggBase(Episode.None, RainimatorEntities.MUTATED, -5134336, -16735132));
    public static final RegistrySupplier<Item> NAMTAR_SPAWN_EGG = register("namtar_spawn_egg", () -> new SpawnEggBase(Episode.None, RainimatorEntities.NAMTAR, -7274496, -12544));
    public static final RegistrySupplier<Item> AGETHA_SPAWN_EGG = register("agetha_spawn_egg", () -> new SpawnEggBase(Episode.None, RainimatorEntities.AGETHA, -6710887, -3381760));
    public static final RegistrySupplier<Item> TRICER_SPAWN_EGG = register("tricer_spawn_egg", () -> new SpawnEggBase(Episode.None, RainimatorEntities.TRICER, -3407872, -16777216));
    public static final RegistrySupplier<Item> BIG_UNDEAD_SKELETON_SPAWN_EGG = register("big_undead_skeleton_spawn_egg", () -> new SpawnEggBase(Episode.None, RainimatorEntities.BIG_UNDEAD_SKELETON, -10066330, -16777216));
    public static final RegistrySupplier<Item> ARCHER_SPAWN_EGG = register("archer_spawn_egg", () -> new SpawnEggBase(Episode.None, RainimatorEntities.ARCHER, -6710887, -16750951));
    public static final RegistrySupplier<Item> DARYLL_SPAWN_EGG = register("daryll_spawn_egg", () -> new SpawnEggBase(Episode.ColdAsIce, RainimatorEntities.DARYLL, -6737152, -1));
    public static final RegistrySupplier<Item> NULL_LIKE_SPAWN_EGG = register("null_like_spawn_egg", () -> new SpawnEggBase(Episode.None, RainimatorEntities.NULL_LIKE, -1, -16777216));
    public static final RegistrySupplier<Item> GIGABONE_SPAWN_EGG = register("gigabone_spawn_egg", () -> new SpawnEggBase(Episode.WeAreTheDanger, RainimatorEntities.GIGABONE, -10066330, -3355393));
    public static final RegistrySupplier<Item> KLAUS_SPAWN_EGG = register("klaus_spawn_egg", () -> new SpawnEggBase(Episode.None, RainimatorEntities.KLAUS, -10066432, -16764109));
    public static final RegistrySupplier<Item> KLAUS_2_SPAWN_EGG = register("klaus_2_spawn_egg", () -> new SpawnEggBase(Episode.None, RainimatorEntities.KLAUS_2, -6711040, -16751002));
    public static final RegistrySupplier<Item> KRALOS_SPAWN_EGG = register("kralos_spawn_egg", () -> new SpawnEggBase(Episode.None, RainimatorEntities.KRALOS, -16777165, -6750157));
    public static final RegistrySupplier<Item> ARABELLA_SPAWN_EGG = register("arabella_spawn_egg", () -> new SpawnEggBase(Episode.ToTheVoid, RainimatorEntities.ARABELLA, -3407668, -13369345));
    public static final RegistrySupplier<Item> AZALEA_SPAWN_EGG = register("azalea_spawn_egg", () -> new SpawnEggBase(Episode.PreachToTheChoir, RainimatorEntities.AZALEA, -256, -16738048));

    private static <T extends Item> RegistrySupplier<T> register(String name, Supplier<T> item) {
        return REGISTRY.register(name, item);
    }

    public static void init() {
        FuelRegistry.register(2000, RainimatorItems.HOT_IRON.get());
    }
}