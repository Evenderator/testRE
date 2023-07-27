
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.re.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.re.entity.TestMobSwEntity;
import net.mcreator.re.entity.TestEntity;
import net.mcreator.re.entity.SinkyEntity;
import net.mcreator.re.entity.GrondikEntity;
import net.mcreator.re.entity.AltercreatureEntity;
import net.mcreator.re.ReMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ReModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ReMod.MODID);
	public static final RegistryObject<EntityType<TestMobSwEntity>> TEST_MOB_SW = register("test_mob_sw",
			EntityType.Builder.<TestMobSwEntity>of(TestMobSwEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TestMobSwEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AltercreatureEntity>> ALTERCREATURE = register("altercreature",
			EntityType.Builder.<AltercreatureEntity>of(AltercreatureEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(32).setUpdateInterval(3).setCustomClientFactory(AltercreatureEntity::new)

					.sized(0.6f, 0.5f));
	public static final RegistryObject<EntityType<GrondikEntity>> GRONDIK = register("grondik",
			EntityType.Builder.<GrondikEntity>of(GrondikEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GrondikEntity::new)

					.sized(1f, 2f));
	public static final RegistryObject<EntityType<SinkyEntity>> SINKY = register("sinky",
			EntityType.Builder.<SinkyEntity>of(SinkyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SinkyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TestEntity>> TEST = register("test",
			EntityType.Builder.<TestEntity>of(TestEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TestEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TestMobSwEntity.init();
			AltercreatureEntity.init();
			GrondikEntity.init();
			SinkyEntity.init();
			TestEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(TEST_MOB_SW.get(), TestMobSwEntity.createAttributes().build());
		event.put(ALTERCREATURE.get(), AltercreatureEntity.createAttributes().build());
		event.put(GRONDIK.get(), GrondikEntity.createAttributes().build());
		event.put(SINKY.get(), SinkyEntity.createAttributes().build());
		event.put(TEST.get(), TestEntity.createAttributes().build());
	}
}
