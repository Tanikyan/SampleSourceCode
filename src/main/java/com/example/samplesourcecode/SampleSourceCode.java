package com.example.samplesourcecode;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.example.samplesourcecode.Listener.PlayerJoinEventListener;

public class SampleSourceCode extends JavaPlugin{
	/* プラグインインスタンス */
	private static Plugin plugin;

	/**
	 * プラグインの起動時に読み込まれるコード。
	 * これがないと起動すらできない。
	 */
	@Override
	public void onEnable() {
		/* 呼び出し用インスタンスの設定 */
		plugin = this;
		/*
		 * Configをフォルダに生成する。
		 * resourcesの中にconfig.ymlを作って生成したいConfigの中身を書く
		 */
		// saveDefaultConfig();

		// イベントを登録する。これを忘れるとイベントが呼ばれない。
		getServer().getPluginManager().registerEvents(new PlayerJoinEventListener(), this);
	}

	public static Plugin getPlugin(){
		return plugin;
	}

}
