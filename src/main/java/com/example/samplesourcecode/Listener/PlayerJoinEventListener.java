package com.example.samplesourcecode.Listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinEventListener implements Listener{

	/**
	 * イベントが発生した時に呼び出されるソース。
	 * カッコの中は取得したいイベントを指定する
	 * @param e
	 */
	@EventHandler
	public void onPlayerJoinEvent(PlayerJoinEvent e) {
		// ログインしたプレイヤーを取得
		Player target = e.getPlayer();
		// プレイヤーにメッセージを送る
		target.sendMessage(target.getName() + "さんいらっしゃいませ！");
	}
}
