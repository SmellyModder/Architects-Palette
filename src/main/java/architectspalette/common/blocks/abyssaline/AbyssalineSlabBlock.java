package architectspalette.common.blocks.abyssaline;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;

public class AbyssalineSlabBlock extends SlabBlock {

	public AbyssalineSlabBlock(Properties properties) {
		super(properties);
	}
	
	@Override
	public int getLightValue(BlockState state, IBlockReader world, BlockPos pos) {
		return state.get(AbyssalineBlock.CHARGED) ? 7 : 0;
	}
	
	@Override
	public BlockState updatePostPlacement(BlockState state, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
		return state.with(AbyssalineBlock.CHARGED, AbyssalineBlock.checkForNearbyChargedBlocks(worldIn, currentPos));
	}
	
	@Override
	public BlockState getStateForPlacement(BlockItemUseContext context) {
		return super.getStateForPlacement(context).with(AbyssalineBlock.CHARGED, AbyssalineBlock.checkForNearbyChargedBlocks(context.getWorld(), context.getPos()));
	}
	
	@Override
	protected void fillStateContainer(Builder<Block, BlockState> builder) {
		builder.add(AbyssalineBlock.CHARGED, TYPE, WATERLOGGED);
	}

}