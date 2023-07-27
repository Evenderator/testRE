
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.re.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.re.ReMod;

public class ReModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ReMod.MODID);
	public static final RegistryObject<SoundEvent> TESTHITSOUND = REGISTRY.register("testhitsound", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("re", "testhitsound")));
	public static final RegistryObject<SoundEvent> TESTDEATHSOUND = REGISTRY.register("testdeathsound", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("re", "testdeathsound")));
	public static final RegistryObject<SoundEvent> TESTAMBIENT = REGISTRY.register("testambient", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("re", "testambient")));
	public static final RegistryObject<SoundEvent> WERD = REGISTRY.register("werd", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("re", "werd")));
	public static final RegistryObject<SoundEvent> ALTERCREAHURT = REGISTRY.register("altercreahurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("re", "altercreahurt")));
	public static final RegistryObject<SoundEvent> ALTERCREADEATH = REGISTRY.register("altercreadeath", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("re", "altercreadeath")));
	public static final RegistryObject<SoundEvent> ALTERCREALIFESOUND = REGISTRY.register("altercrealifesound", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("re", "altercrealifesound")));
	public static final RegistryObject<SoundEvent> PELANSITEARMOR = REGISTRY.register("pelansitearmor", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("re", "pelansitearmor")));
	public static final RegistryObject<SoundEvent> ZNEWBREAD = REGISTRY.register("znewbread", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("re", "znewbread")));
	public static final RegistryObject<SoundEvent> ZNEWBREAD1 = REGISTRY.register("znewbread1", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("re", "znewbread1")));
	public static final RegistryObject<SoundEvent> GRONDIKLIFESOUND = REGISTRY.register("grondiklifesound", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("re", "grondiklifesound")));
	public static final RegistryObject<SoundEvent> GRONDIKDEATH = REGISTRY.register("grondikdeath", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("re", "grondikdeath")));
	public static final RegistryObject<SoundEvent> GRONDIKHURT = REGISTRY.register("grondikhurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("re", "grondikhurt")));
	public static final RegistryObject<SoundEvent> GRONDIKWALKING = REGISTRY.register("grondikwalking", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("re", "grondikwalking")));
	public static final RegistryObject<SoundEvent> DIESANDTHING = REGISTRY.register("diesandthing", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("re", "diesandthing")));
	public static final RegistryObject<SoundEvent> SANDTHINGHURTSOUND = REGISTRY.register("sandthinghurtsound", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("re", "sandthinghurtsound")));
	public static final RegistryObject<SoundEvent> SANDTHINGLIVESOUND = REGISTRY.register("sandthinglivesound", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("re", "sandthinglivesound")));
	public static final RegistryObject<SoundEvent> SOUNDTHINGWALKINGSOUND = REGISTRY.register("soundthingwalkingsound", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("re", "soundthingwalkingsound")));
	public static final RegistryObject<SoundEvent> SINKYDIE = REGISTRY.register("sinkydie", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("re", "sinkydie")));
	public static final RegistryObject<SoundEvent> SINKYIDLEREAL = REGISTRY.register("sinkyidlereal", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("re", "sinkyidlereal")));
	public static final RegistryObject<SoundEvent> SINKYHURT = REGISTRY.register("sinkyhurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("re", "sinkyhurt")));
	public static final RegistryObject<SoundEvent> SINKYWALK = REGISTRY.register("sinkywalk", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("re", "sinkywalk")));
}
